// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSlrAndSlsProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateSlrAndSlsProjectRequest</p>
 */
public class CreateSlrAndSlsProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private CreateSlrAndSlsProjectRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlrAndSlsProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CreateSlrAndSlsProjectRequest, Builder> {
        private String businessType; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlrAndSlsProjectRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.region = request.region;
        } 

        /**
         * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
         * <ul>
         * <li><strong>cdn_log_access_l1</strong>: access logs of L1 Dynamic Route for CDN (DCDN) points of presence (POPs)</li>
         * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
         * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The region where Log Service resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong></li>
         * <li><strong>cn-shanghai</strong></li>
         * <li><strong>cn-qingdao</strong></li>
         * <li><strong>cn-beijing</strong></li>
         * <li><strong>cn-zhangjiakou</strong></li>
         * <li><strong>cn-shenzhen</strong></li>
         * <li><strong>eu-central-1</strong></li>
         * <li><strong>us-west-1</strong></li>
         * <li><strong>ap-south-1</strong></li>
         * <li><strong>ap-southeast-1</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateSlrAndSlsProjectRequest build() {
            return new CreateSlrAndSlsProjectRequest(this);
        } 

    } 

}
