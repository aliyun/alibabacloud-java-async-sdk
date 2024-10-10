// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupRequest</p>
 */
public class DeleteGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DeleteGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteGroupRequest, Builder> {
        private Long groupId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The ID of the server group that you want to delete.</p>
         * <blockquote>
         * <p> To delete a server group, you must provide the ID of the server group. You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9454789</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.172.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteGroupRequest build() {
            return new DeleteGroupRequest(this);
        } 

    } 

}
