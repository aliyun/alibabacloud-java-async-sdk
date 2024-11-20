// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelUpdateStackRequest} extends {@link RequestModel}
 *
 * <p>CancelUpdateStackRequest</p>
 */
public class CancelUpdateStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelType")
    private String cancelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    private CancelUpdateStackRequest(Builder builder) {
        super(builder);
        this.cancelType = builder.cancelType;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelUpdateStackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelType
     */
    public String getCancelType() {
        return this.cancelType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<CancelUpdateStackRequest, Builder> {
        private String cancelType; 
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(CancelUpdateStackRequest request) {
            super(request);
            this.cancelType = request.cancelType;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
        } 

        /**
         * <p>The method to cancel the update operation. Valid values:</p>
         * <ul>
         * <li>Quick: cancels the update of a stack as soon as possible.</li>
         * <li>Safe: cancels the update of a stack as safely as possible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Safe</p>
         */
        public Builder cancelType(String cancelType) {
            this.putQueryParameter("CancelType", cancelType);
            this.cancelType = cancelType;
            return this;
        }

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public CancelUpdateStackRequest build() {
            return new CancelUpdateStackRequest(this);
        } 

    } 

}
