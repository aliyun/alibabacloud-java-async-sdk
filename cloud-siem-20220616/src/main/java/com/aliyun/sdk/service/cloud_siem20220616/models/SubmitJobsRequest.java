// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitJobsRequest</p>
 */
public class SubmitJobsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JsonParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SubmitJobsRequest(Builder builder) {
        super(builder);
        this.jsonParam = builder.jsonParam;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonParam
     */
    public String getJsonParam() {
        return this.jsonParam;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SubmitJobsRequest, Builder> {
        private String jsonParam; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitJobsRequest request) {
            super(request);
            this.jsonParam = request.jsonParam;
            this.regionId = request.regionId;
        } 

        /**
         * The parameters of the logs that you want to add. The value is a JSON array, which contains the following parameters:\
         * <p>
         * 
         * 
         * *   SourceProdCode: the code of the cloud service.
         * 
         * *   SourceLogCode: the code of the log.
         * 
         * *   Deleted: specifies whether to add the log. Valid values:
         * 
         *     *   0: yes
         *     *   1: no
         */
        public Builder jsonParam(String jsonParam) {
            this.putBodyParameter("JsonParam", jsonParam);
            this.jsonParam = jsonParam;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SubmitJobsRequest build() {
            return new SubmitJobsRequest(this);
        } 

    } 

}
