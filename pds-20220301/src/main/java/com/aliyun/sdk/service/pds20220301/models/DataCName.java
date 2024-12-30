// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DataCName} extends {@link TeaModel}
 *
 * <p>DataCName</p>
 */
public class DataCName extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cert_expire_time")
    private Long certExpireTime;

    @com.aliyun.core.annotation.NameInMap("cert_name")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("cname_type")
    private String cnameType;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("store_id")
    private String storeId;

    private DataCName(Builder builder) {
        this.certExpireTime = builder.certExpireTime;
        this.certName = builder.certName;
        this.cname = builder.cname;
        this.cnameType = builder.cnameType;
        this.location = builder.location;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataCName create() {
        return builder().build();
    }

    /**
     * @return certExpireTime
     */
    public Long getCertExpireTime() {
        return this.certExpireTime;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return cnameType
     */
    public String getCnameType() {
        return this.cnameType;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder {
        private Long certExpireTime; 
        private String certName; 
        private String cname; 
        private String cnameType; 
        private String location; 
        private String storeId; 

        /**
         * cert_expire_time.
         */
        public Builder certExpireTime(Long certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }

        /**
         * cert_name.
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * cname.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * cname_type.
         */
        public Builder cnameType(String cnameType) {
            this.cnameType = cnameType;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * store_id.
         */
        public Builder storeId(String storeId) {
            this.storeId = storeId;
            return this;
        }

        public DataCName build() {
            return new DataCName(this);
        } 

    } 

}
