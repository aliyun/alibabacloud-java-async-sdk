// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DesensitizeDataRequest} extends {@link RequestModel}
 *
 * <p>DesensitizeDataRequest</p>
 */
public class DesensitizeDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Body
    @NameInMap("SceneCode")
    @Validation(required = true)
    private String sceneCode;

    private DesensitizeDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.data = builder.data;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DesensitizeDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<DesensitizeDataRequest, Builder> {
        private String regionId; 
        private String data; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(DesensitizeDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.data = request.data;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The data that you want to mask.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The code of the data masking scene. You can view the code on the Data Masking page in Data Security Guard of the DataWorks console.
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public DesensitizeDataRequest build() {
            return new DesensitizeDataRequest(this);
        } 

    } 

}
