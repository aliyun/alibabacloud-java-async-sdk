// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PolicyDetailInfo} extends {@link TeaModel}
 *
 * <p>PolicyDetailInfo</p>
 */
public class PolicyDetailInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("classId")
    private String classId;

    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    private PolicyDetailInfo(Builder builder) {
        this.classId = builder.classId;
        this.className = builder.className;
        this.config = builder.config;
        this.description = builder.description;
        this.name = builder.name;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyDetailInfo create() {
        return builder().build();
    }

    /**
     * @return classId
     */
    public String getClassId() {
        return this.classId;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder {
        private String classId; 
        private String className; 
        private String config; 
        private String description; 
        private String name; 
        private String policyId; 

        /**
         * classId.
         */
        public Builder classId(String classId) {
            this.classId = classId;
            return this;
        }

        /**
         * className.
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * policyId.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        public PolicyDetailInfo build() {
            return new PolicyDetailInfo(this);
        } 

    } 

}
