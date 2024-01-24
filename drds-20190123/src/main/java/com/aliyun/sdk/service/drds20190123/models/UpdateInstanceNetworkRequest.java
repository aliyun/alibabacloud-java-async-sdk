// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceNetworkRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceNetworkRequest</p>
 */
public class UpdateInstanceNetworkRequest extends Request {
    @Query
    @NameInMap("ClassicExpiredDays")
    private Integer classicExpiredDays;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RetainClassic")
    private Boolean retainClassic;

    @Query
    @NameInMap("SrcInstanceNetworkType")
    @Validation(required = true)
    private String srcInstanceNetworkType;

    private UpdateInstanceNetworkRequest(Builder builder) {
        super(builder);
        this.classicExpiredDays = builder.classicExpiredDays;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.retainClassic = builder.retainClassic;
        this.srcInstanceNetworkType = builder.srcInstanceNetworkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceNetworkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classicExpiredDays
     */
    public Integer getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return retainClassic
     */
    public Boolean getRetainClassic() {
        return this.retainClassic;
    }

    /**
     * @return srcInstanceNetworkType
     */
    public String getSrcInstanceNetworkType() {
        return this.srcInstanceNetworkType;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceNetworkRequest, Builder> {
        private Integer classicExpiredDays; 
        private String drdsInstanceId; 
        private Boolean retainClassic; 
        private String srcInstanceNetworkType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceNetworkRequest request) {
            super(request);
            this.classicExpiredDays = request.classicExpiredDays;
            this.drdsInstanceId = request.drdsInstanceId;
            this.retainClassic = request.retainClassic;
            this.srcInstanceNetworkType = request.srcInstanceNetworkType;
        } 

        /**
         * Specifies the retention period of the classic network endpoint. Unit: days.
         */
        public Builder classicExpiredDays(Integer classicExpiredDays) {
            this.putQueryParameter("ClassicExpiredDays", classicExpiredDays);
            this.classicExpiredDays = classicExpiredDays;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * Specifies whether to retain the classic network endpoint.
         */
        public Builder retainClassic(Boolean retainClassic) {
            this.putQueryParameter("RetainClassic", retainClassic);
            this.retainClassic = retainClassic;
            return this;
        }

        /**
         * The network type of the PolarDB-X 1.0 instance. Valid values:
         * <p>
         * 
         * *   vpc: Virtual Private Cloud (VPC)
         * *   classic: classic network
         */
        public Builder srcInstanceNetworkType(String srcInstanceNetworkType) {
            this.putQueryParameter("SrcInstanceNetworkType", srcInstanceNetworkType);
            this.srcInstanceNetworkType = srcInstanceNetworkType;
            return this;
        }

        @Override
        public UpdateInstanceNetworkRequest build() {
            return new UpdateInstanceNetworkRequest(this);
        } 

    } 

}
