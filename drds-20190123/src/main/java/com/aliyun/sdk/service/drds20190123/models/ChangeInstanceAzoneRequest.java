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
 * {@link ChangeInstanceAzoneRequest} extends {@link RequestModel}
 *
 * <p>ChangeInstanceAzoneRequest</p>
 */
public class ChangeInstanceAzoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeVSwitch")
    private Boolean changeVSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewVSwitch")
    private String newVSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginAzoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originAzoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetAzoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetAzoneId;

    private ChangeInstanceAzoneRequest(Builder builder) {
        super(builder);
        this.changeVSwitch = builder.changeVSwitch;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.drdsRegionId = builder.drdsRegionId;
        this.newVSwitch = builder.newVSwitch;
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
     * @return changeVSwitch
     */
    public Boolean getChangeVSwitch() {
        return this.changeVSwitch;
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
     * @return newVSwitch
     */
    public String getNewVSwitch() {
        return this.newVSwitch;
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
        private Boolean changeVSwitch; 
        private String drdsInstanceId; 
        private String drdsRegionId; 
        private String newVSwitch; 
        private String originAzoneId; 
        private String targetAzoneId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeInstanceAzoneRequest request) {
            super(request);
            this.changeVSwitch = request.changeVSwitch;
            this.drdsInstanceId = request.drdsInstanceId;
            this.drdsRegionId = request.drdsRegionId;
            this.newVSwitch = request.newVSwitch;
            this.originAzoneId = request.originAzoneId;
            this.targetAzoneId = request.targetAzoneId;
        } 

        /**
         * ChangeVSwitch.
         */
        public Builder changeVSwitch(Boolean changeVSwitch) {
            this.putQueryParameter("ChangeVSwitch", changeVSwitch);
            this.changeVSwitch = changeVSwitch;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drdsjiii1b49****</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder drdsRegionId(String drdsRegionId) {
            this.putQueryParameter("DrdsRegionId", drdsRegionId);
            this.drdsRegionId = drdsRegionId;
            return this;
        }

        /**
         * NewVSwitch.
         */
        public Builder newVSwitch(String newVSwitch) {
            this.putQueryParameter("NewVSwitch", newVSwitch);
            this.newVSwitch = newVSwitch;
            return this;
        }

        /**
         * <p>The source zone of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-B</p>
         */
        public Builder originAzoneId(String originAzoneId) {
            this.putQueryParameter("OriginAzoneId", originAzoneId);
            this.originAzoneId = originAzoneId;
            return this;
        }

        /**
         * <p>The destination zone to which you want to modify</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-A</p>
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
