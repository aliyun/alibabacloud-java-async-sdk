// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateInstanceNetworkRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceNetworkRequest</p>
 */
public class UpdateInstanceNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClassicExpiredDays")
    private Integer classicExpiredDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainClassic")
    private Boolean retainClassic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcInstanceNetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies the retention period of the classic network endpoint. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder classicExpiredDays(Integer classicExpiredDays) {
            this.putQueryParameter("ClassicExpiredDays", classicExpiredDays);
            this.classicExpiredDays = classicExpiredDays;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds******</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to retain the classic network endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder retainClassic(Boolean retainClassic) {
            this.putQueryParameter("RetainClassic", retainClassic);
            this.retainClassic = retainClassic;
            return this;
        }

        /**
         * <p>The network type of the PolarDB-X 1.0 instance. Valid values:</p>
         * <ul>
         * <li>vpc: Virtual Private Cloud (VPC)</li>
         * <li>classic: classic network</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>classic</p>
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
