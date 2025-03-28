// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ArtifactSpec} extends {@link TeaModel}
 *
 * <p>ArtifactSpec</p>
 */
public class ArtifactSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("runtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtime;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    private ArtifactSpec(Builder builder) {
        this.runtime = builder.runtime;
        this.type = builder.type;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String runtime; 
        private String type; 
        private String uri; 

        private Builder() {
        } 

        private Builder(ArtifactSpec model) {
            this.runtime = model.runtime;
            this.type = model.type;
            this.uri = model.uri;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom.debian10</p>
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC代码包、工作流yaml</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://cn-hangzhou/my-bucket/my.zip</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ArtifactSpec build() {
            return new ArtifactSpec(this);
        } 

    } 

}
