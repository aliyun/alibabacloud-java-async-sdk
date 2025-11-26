// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link PrepayResource} extends {@link TeaModel}
 *
 * <p>PrepayResource</p>
 */
public class PrepayResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("catalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("cu")
    private Integer cu;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceStatus")
    private String instanceStatus;

    private PrepayResource(Builder builder) {
        this.catalogId = builder.catalogId;
        this.catalogName = builder.catalogName;
        this.cu = builder.cu;
        this.expireTime = builder.expireTime;
        this.gmtCreate = builder.gmtCreate;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepayResource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public static final class Builder {
        private String catalogId; 
        private String catalogName; 
        private Integer cu; 
        private Long expireTime; 
        private Long gmtCreate; 
        private String instanceId; 
        private String instanceStatus; 

        private Builder() {
        } 

        private Builder(PrepayResource model) {
            this.catalogId = model.catalogId;
            this.catalogName = model.catalogName;
            this.cu = model.cu;
            this.expireTime = model.expireTime;
            this.gmtCreate = model.gmtCreate;
            this.instanceId = model.instanceId;
            this.instanceStatus = model.instanceStatus;
        } 

        /**
         * catalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * catalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * cu.
         */
        public Builder cu(Integer cu) {
            this.cu = cu;
            return this;
        }

        /**
         * expireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        public PrepayResource build() {
            return new PrepayResource(this);
        } 

    } 

}
