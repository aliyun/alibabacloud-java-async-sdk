// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectMessagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeProjectMessagesRequest</p>
 */
public class DescribeProjectMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    private DescribeProjectMessagesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageIndex = builder.pageIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectMessagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public static final class Builder extends Request.Builder<DescribeProjectMessagesRequest, Builder> {
        private String instanceId; 
        private Integer pageIndex; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProjectMessagesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageIndex = request.pageIndex;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        @Override
        public DescribeProjectMessagesRequest build() {
            return new DescribeProjectMessagesRequest(this);
        } 

    } 

}
