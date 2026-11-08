// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupRequest</p>
 */
public class CreateMonitorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private CreateMonitorGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.contactGroups = builder.contactGroups;
        this.dryRun = builder.dryRun;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return contactGroups
     */
    public String getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupRequest, Builder> {
        private String clientToken; 
        private String contactGroups; 
        private Boolean dryRun; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.contactGroups = request.contactGroups;
            this.dryRun = request.dryRun;
            this.groupName = request.groupName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The alert contact group. Alert notifications for the application group are sent to the alert contacts in this alert contact group.</p>
         * <blockquote>
         * <p>An alert contact group contains one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="~~PutContact~~">PutContact</a> and <a href="~~PutContactGroup~~">PutContactGroup</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS_Alert_Group</p>
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request, including checks on permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Sends a regular request. If the request passes the check, the name and description of the route table are modified.</li>
         * <li><strong>true</strong>: Sends a dry run request. Only the check is performed, and the name and description of the route table are not modified. The check items include whether required parameters are specified and whether the request format is valid. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The name of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public CreateMonitorGroupRequest build() {
            return new CreateMonitorGroupRequest(this);
        } 

    } 

}
