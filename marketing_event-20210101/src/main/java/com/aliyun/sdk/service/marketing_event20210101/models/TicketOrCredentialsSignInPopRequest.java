// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TicketOrCredentialsSignInPopRequest} extends {@link RequestModel}
 *
 * <p>TicketOrCredentialsSignInPopRequest</p>
 */
public class TicketOrCredentialsSignInPopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConferenceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conferenceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Idcard")
    private String idcard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private TicketOrCredentialsSignInPopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activityId = builder.activityId;
        this.code = builder.code;
        this.conferenceName = builder.conferenceName;
        this.deviceId = builder.deviceId;
        this.entryName = builder.entryName;
        this.idcard = builder.idcard;
        this.signTime = builder.signTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketOrCredentialsSignInPopRequest create() {
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
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return conferenceName
     */
    public String getConferenceName() {
        return this.conferenceName;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return entryName
     */
    public String getEntryName() {
        return this.entryName;
    }

    /**
     * @return idcard
     */
    public String getIdcard() {
        return this.idcard;
    }

    /**
     * @return signTime
     */
    public String getSignTime() {
        return this.signTime;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<TicketOrCredentialsSignInPopRequest, Builder> {
        private String regionId; 
        private String activityId; 
        private String code; 
        private String conferenceName; 
        private String deviceId; 
        private String entryName; 
        private String idcard; 
        private String signTime; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(TicketOrCredentialsSignInPopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activityId = request.activityId;
            this.code = request.code;
            this.conferenceName = request.conferenceName;
            this.deviceId = request.deviceId;
            this.entryName = request.entryName;
            this.idcard = request.idcard;
            this.signTime = request.signTime;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4546</p>
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>会议名称</p>
         */
        public Builder conferenceName(String conferenceName) {
            this.putQueryParameter("ConferenceName", conferenceName);
            this.conferenceName = conferenceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Z10</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>入口名称</p>
         */
        public Builder entryName(String entryName) {
            this.putQueryParameter("EntryName", entryName);
            this.entryName = entryName;
            return this;
        }

        /**
         * Idcard.
         */
        public Builder idcard(String idcard) {
            this.putQueryParameter("Idcard", idcard);
            this.idcard = idcard;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-25 14:11</p>
         */
        public Builder signTime(String signTime) {
            this.putQueryParameter("SignTime", signTime);
            this.signTime = signTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public TicketOrCredentialsSignInPopRequest build() {
            return new TicketOrCredentialsSignInPopRequest(this);
        } 

    } 

}
