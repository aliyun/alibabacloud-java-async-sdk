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
 * {@link DeleteMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupRequest</p>
 */
public class DeleteMonitorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    private DeleteMonitorGroupRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupRequest, Builder> {
        private Boolean dryRun; 
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.groupId = request.groupId;
        } 

        /**
         * <p>Specifies whether to perform a dry run on the request. A dry run includes checks on permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, the name and description of the route table are modified.</li>
         * <li><strong>true</strong>: Sends a dry run request. Only the check is performed, and the name and description of the route table are not modified. Check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>246139436</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DeleteMonitorGroupRequest build() {
            return new DeleteMonitorGroupRequest(this);
        } 

    } 

}
