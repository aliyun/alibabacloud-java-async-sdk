// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStreamsNotifyUrlConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVsStreamsNotifyUrlConfigRequest</p>
 */
public class DescribeVsStreamsNotifyUrlConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DescribeVsStreamsNotifyUrlConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsStreamsNotifyUrlConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeVsStreamsNotifyUrlConfigRequest, Builder> {
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVsStreamsNotifyUrlConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeVsStreamsNotifyUrlConfigRequest build() {
            return new DescribeVsStreamsNotifyUrlConfigRequest(this);
        } 

    } 

}
