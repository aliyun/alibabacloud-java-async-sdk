// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EtlMeta} extends {@link TeaModel}
 *
 * <p>EtlMeta</p>
 */
public class EtlMeta extends TeaModel {
    @NameInMap("enable")
    @Validation(required = true)
    private Boolean enable;

    @NameInMap("etlMetaKey")
    @Validation(required = true)
    private String etlMetaKey;

    @NameInMap("etlMetaName")
    @Validation(required = true)
    private String etlMetaName;

    @NameInMap("etlMetaTag")
    private String etlMetaTag;

    @NameInMap("etlMetaValue")
    private String etlMetaValue;

    private EtlMeta(Builder builder) {
        this.enable = builder.enable;
        this.etlMetaKey = builder.etlMetaKey;
        this.etlMetaName = builder.etlMetaName;
        this.etlMetaTag = builder.etlMetaTag;
        this.etlMetaValue = builder.etlMetaValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EtlMeta create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return etlMetaKey
     */
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    /**
     * @return etlMetaName
     */
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    /**
     * @return etlMetaTag
     */
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    /**
     * @return etlMetaValue
     */
    public String getEtlMetaValue() {
        return this.etlMetaValue;
    }

    public static final class Builder {
        private Boolean enable; 
        private String etlMetaKey; 
        private String etlMetaName; 
        private String etlMetaTag; 
        private String etlMetaValue; 

        /**
         * 是否启用
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * key
         */
        public Builder etlMetaKey(String etlMetaKey) {
            this.etlMetaKey = etlMetaKey;
            return this;
        }

        /**
         * 名字
         */
        public Builder etlMetaName(String etlMetaName) {
            this.etlMetaName = etlMetaName;
            return this;
        }

        /**
         * tag
         */
        public Builder etlMetaTag(String etlMetaTag) {
            this.etlMetaTag = etlMetaTag;
            return this;
        }

        /**
         * value
         */
        public Builder etlMetaValue(String etlMetaValue) {
            this.etlMetaValue = etlMetaValue;
            return this;
        }

        public EtlMeta build() {
            return new EtlMeta(this);
        } 

    } 

}
