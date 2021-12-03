// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OutputCodeLocation} extends {@link TeaModel}
 *
 * <p>OutputCodeLocation</p>
 */
public class OutputCodeLocation extends TeaModel {
    @NameInMap("location")
    private String location;

    @NameInMap("repositoryType")
    private String repositoryType;


    private OutputCodeLocation(Builder builder) {
        this.location = builder.location;
        this.repositoryType = builder.repositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutputCodeLocation create() {
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
         * <p>location</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>repositoryType</p>
         */
        public Builder repositoryType(String repositoryType) {
            this.repositoryType = repositoryType;
            return this;
        }

        public OutputCodeLocation build() {
            return new OutputCodeLocation(this);
        } 

    } 

}
