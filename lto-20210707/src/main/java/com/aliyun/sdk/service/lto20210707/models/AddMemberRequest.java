// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link AddMemberRequest} extends {@link RequestModel}
 *
 * <p>AddMemberRequest</p>
 */
public class AddMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizedCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedDeviceCount")
    private Integer authorizedDeviceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Contactor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Telephony")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telephony;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    private AddMemberRequest(Builder builder) {
        super(builder);
        this.authorizedCount = builder.authorizedCount;
        this.authorizedDeviceCount = builder.authorizedDeviceCount;
        this.contactor = builder.contactor;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.telephony = builder.telephony;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedCount
     */
    public Long getAuthorizedCount() {
        return this.authorizedCount;
    }

    /**
     * @return authorizedDeviceCount
     */
    public Integer getAuthorizedDeviceCount() {
        return this.authorizedDeviceCount;
    }

    /**
     * @return contactor
     */
    public String getContactor() {
        return this.contactor;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return telephony
     */
    public String getTelephony() {
        return this.telephony;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<AddMemberRequest, Builder> {
        private Long authorizedCount; 
        private Integer authorizedDeviceCount; 
        private String contactor; 
        private String name; 
        private String regionId; 
        private String remark; 
        private String telephony; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(AddMemberRequest request) {
            super(request);
            this.authorizedCount = request.authorizedCount;
            this.authorizedDeviceCount = request.authorizedDeviceCount;
            this.contactor = request.contactor;
            this.name = request.name;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.telephony = request.telephony;
            this.uid = request.uid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authorizedCount(Long authorizedCount) {
            this.putQueryParameter("AuthorizedCount", authorizedCount);
            this.authorizedCount = authorizedCount;
            return this;
        }

        /**
         * AuthorizedDeviceCount.
         */
        public Builder authorizedDeviceCount(Integer authorizedDeviceCount) {
            this.putQueryParameter("AuthorizedDeviceCount", authorizedDeviceCount);
            this.authorizedDeviceCount = authorizedDeviceCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactor(String contactor) {
            this.putQueryParameter("Contactor", contactor);
            this.contactor = contactor;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder telephony(String telephony) {
            this.putQueryParameter("Telephony", telephony);
            this.telephony = telephony;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public AddMemberRequest build() {
            return new AddMemberRequest(this);
        } 

    } 

}
