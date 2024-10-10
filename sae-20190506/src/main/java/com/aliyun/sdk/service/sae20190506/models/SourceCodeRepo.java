// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SourceCodeRepo} extends {@link TeaModel}
 *
 * <p>SourceCodeRepo</p>
 */
public class SourceCodeRepo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FullName")
    private String fullName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private SourceCodeRepo(Builder builder) {
        this.fullName = builder.fullName;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceCodeRepo create() {
        return builder().build();
    }

    /**
     * @return fullName
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String fullName; 
        private String id; 
        private String name; 

        /**
         * FullName.
         */
        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public SourceCodeRepo build() {
            return new SourceCodeRepo(this);
        } 

    } 

}
