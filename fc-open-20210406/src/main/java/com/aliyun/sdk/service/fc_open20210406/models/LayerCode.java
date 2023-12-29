// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LayerCode} extends {@link TeaModel}
 *
 * <p>LayerCode</p>
 */
public class LayerCode extends TeaModel {
    @NameInMap("location")
    private String location;

    @NameInMap("repositoryType")
    private String repositoryType;

    private LayerCode(Builder builder) {
        this.location = builder.location;
        this.repositoryType = builder.repositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LayerCode create() {
        return builder().build();
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return repositoryType
     */
    public String getRepositoryType() {
        return this.repositoryType;
    }

    public static final class Builder {
        private String location; 
        private String repositoryType; 

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * repositoryType.
         */
        public Builder repositoryType(String repositoryType) {
            this.repositoryType = repositoryType;
            return this;
        }

        public LayerCode build() {
            return new LayerCode(this);
        } 

    } 

}
