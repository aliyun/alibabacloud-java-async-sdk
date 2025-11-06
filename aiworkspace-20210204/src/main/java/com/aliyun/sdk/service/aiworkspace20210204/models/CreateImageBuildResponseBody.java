// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateImageBuildResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageBuildResponseBody</p>
 */
public class CreateImageBuildResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageBuildId")
    private String imageBuildId;

    @com.aliyun.core.annotation.NameInMap("ImageBuildJobId")
    private String imageBuildJobId;

    private CreateImageBuildResponseBody(Builder builder) {
        this.imageBuildId = builder.imageBuildId;
        this.imageBuildJobId = builder.imageBuildJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageBuildResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageBuildId
     */
    public String getImageBuildId() {
        return this.imageBuildId;
    }

    /**
     * @return imageBuildJobId
     */
    public String getImageBuildJobId() {
        return this.imageBuildJobId;
    }

    public static final class Builder {
        private String imageBuildId; 
        private String imageBuildJobId; 

        private Builder() {
        } 

        private Builder(CreateImageBuildResponseBody model) {
            this.imageBuildId = model.imageBuildId;
            this.imageBuildJobId = model.imageBuildJobId;
        } 

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>build-****ks92</p>
         */
        public Builder imageBuildId(String imageBuildId) {
            this.imageBuildId = imageBuildId;
            return this;
        }

        /**
         * ImageBuildJobId.
         */
        public Builder imageBuildJobId(String imageBuildJobId) {
            this.imageBuildJobId = imageBuildJobId;
            return this;
        }

        public CreateImageBuildResponseBody build() {
            return new CreateImageBuildResponseBody(this);
        } 

    } 

}
