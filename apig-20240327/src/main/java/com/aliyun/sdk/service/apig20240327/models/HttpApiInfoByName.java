// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiInfoByName} extends {@link TeaModel}
 *
 * <p>HttpApiInfoByName</p>
 */
public class HttpApiInfoByName extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("versionEnabled")
    private Boolean versionEnabled;

    @com.aliyun.core.annotation.NameInMap("versionedHttpApis")
    private java.util.List<HttpApiApiInfo> versionedHttpApis;

    private HttpApiInfoByName(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.versionEnabled = builder.versionEnabled;
        this.versionedHttpApis = builder.versionedHttpApis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiInfoByName create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return versionEnabled
     */
    public Boolean getVersionEnabled() {
        return this.versionEnabled;
    }

    /**
     * @return versionedHttpApis
     */
    public java.util.List<HttpApiApiInfo> getVersionedHttpApis() {
        return this.versionedHttpApis;
    }

    public static final class Builder {
        private String name; 
        private String type; 
        private Boolean versionEnabled; 
        private java.util.List<HttpApiApiInfo> versionedHttpApis; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * versionEnabled.
         */
        public Builder versionEnabled(Boolean versionEnabled) {
            this.versionEnabled = versionEnabled;
            return this;
        }

        /**
         * versionedHttpApis.
         */
        public Builder versionedHttpApis(java.util.List<HttpApiApiInfo> versionedHttpApis) {
            this.versionedHttpApis = versionedHttpApis;
            return this;
        }

        public HttpApiInfoByName build() {
            return new HttpApiInfoByName(this);
        } 

    } 

}
