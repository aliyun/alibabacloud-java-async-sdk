// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LineageEntityVO} extends {@link TeaModel}
 *
 * <p>LineageEntityVO</p>
 */
public class LineageEntityVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetailUrl")
    private String detailUrl;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentName")
    private String parentName;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    private LineageEntityVO(Builder builder) {
        this.detailUrl = builder.detailUrl;
        this.name = builder.name;
        this.parentName = builder.parentName;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageEntityVO create() {
        return builder().build();
    }

    /**
     * @return detailUrl
     */
    public String getDetailUrl() {
        return this.detailUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentName
     */
    public String getParentName() {
        return this.parentName;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder {
        private String detailUrl; 
        private String name; 
        private String parentName; 
        private String qualifiedName; 

        /**
         * DetailUrl.
         */
        public Builder detailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentName.
         */
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        public LineageEntityVO build() {
            return new LineageEntityVO(this);
        } 

    } 

}
