// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetIndexCurrentValueRequest} extends {@link RequestModel}
 *
 * <p>GetIndexCurrentValueRequest</p>
 */
public class GetIndexCurrentValueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepIds")
    private String depIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private String groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private GetIndexCurrentValueRequest(Builder builder) {
        super(builder);
        this.depIds = builder.depIds;
        this.groupIds = builder.groupIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexCurrentValueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return depIds
     */
    public String getDepIds() {
        return this.depIds;
    }

    /**
     * @return groupIds
     */
    public String getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetIndexCurrentValueRequest, Builder> {
        private String depIds; 
        private String groupIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexCurrentValueRequest request) {
            super(request);
            this.depIds = request.depIds;
            this.groupIds = request.groupIds;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The list of department IDs. Separate multiple IDs with commas (,).</p>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> operation and check the <strong>DepartmentId</strong> parameter in the response to obtain the department ID.</p>
         * <blockquote>
         * <p>When this parameter is not empty:</p>
         * <ul>
         * <li>If GroupIds is not empty, the query is performed based on the skill group list corresponding to GroupIds.</li>
         * <li>If GroupIds is empty, the query is performed based on the department list corresponding to this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2332****,2334****</p>
         */
        public Builder depIds(String depIds) {
            this.putQueryParameter("DepIds", depIds);
            this.depIds = depIds;
            return this;
        }

        /**
         * <p>The list of skill group IDs. Separate multiple IDs with commas (,).</p>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2717970.html">QuerySkillGroups</a> operation and check the <strong>SkillGroupId</strong> parameter in the response to obtain the skill group ID.</p>
         * <blockquote>
         * <p>When this parameter is not empty, the query is performed based on the skill group list corresponding to this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2323****,2324****</p>
         */
        public Builder groupIds(String groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>The AICCS instance ID. You can obtain the instance ID from <b>Instance Management</b> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <blockquote>
         * <p>The AICCS instance ID is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetIndexCurrentValueRequest build() {
            return new GetIndexCurrentValueRequest(this);
        } 

    } 

}
