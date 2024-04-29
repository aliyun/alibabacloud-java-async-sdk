// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the server group that you want to delete.
         * <p>
         * 
         * >  To delete a server group, you must provide the ID of the server group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the ID.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The source IP address of the request.
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
