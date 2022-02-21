// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeInstanceAzoneRequest} extends {@link RequestModel}
 *
 * <p>ChangeInstanceAzoneRequest</p>
 */
public class ChangeInstanceAzoneRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("DrdsRegionId")
    @Validation(required = true)
    private String drdsRegionId;

    @Query
    @NameInMap("OriginAzoneId")
    @Validation(required = true)
    private String originAzoneId;

    @Query
    @NameInMap("TargetAzoneId")
    @Validation(required = true)
    private String targetAzoneId;

    private ChangeInstanceAzoneRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.drdsRegionId = builder.drdsRegionId;
        this.originAzoneId = builder.originAzoneId;
        this.targetAzoneId = builder.targetAzoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeInstanceAzoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return drdsRegionId
     */
    public String getDrdsRegionId() {
        return this.drdsRegionId;
    }

    /**
     * @return originAzoneId
     */
    public String getOriginAzoneId() {
        return this.originAzoneId;
    }

    /**
     * @return targetAzoneId
     */
    public String getTargetAzoneId() {
        return this.targetAzoneId;
    }

    public static final class Builder extends Request.Builder<ChangeInstanceAzoneRequest, Builder> {
        private String drdsInstanceId; 
        private String drdsRegionId; 
        private String originAzoneId; 
        private String targetAzoneId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeInstanceAzoneRequest response) {
            super(response);
            this.drdsInstanceId = response.drdsInstanceId;
            this.drdsRegionId = response.drdsRegionId;
            this.originAzoneId = response.originAzoneId;
            this.targetAzoneId = response.targetAzoneId;
        } 

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * DrdsRegionId.
         */
        public Builder drdsRegionId(String drdsRegionId) {
            this.putQueryParameter("DrdsRegionId", drdsRegionId);
            this.drdsRegionId = drdsRegionId;
            return this;
        }

        /**
         * OriginAzoneId.
         */
        public Builder originAzoneId(String originAzoneId) {
            this.putQueryParameter("OriginAzoneId", originAzoneId);
            this.originAzoneId = originAzoneId;
            return this;
        }

        /**
         * TargetAzoneId.
         */
        public Builder targetAzoneId(String targetAzoneId) {
            this.putQueryParameter("TargetAzoneId", targetAzoneId);
            this.targetAzoneId = targetAzoneId;
            return this;
        }

        @Override
        public ChangeInstanceAzoneRequest build() {
            return new ChangeInstanceAzoneRequest(this);
        } 

    } 

}
