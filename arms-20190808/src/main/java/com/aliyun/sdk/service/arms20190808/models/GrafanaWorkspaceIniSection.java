// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GrafanaWorkspaceIniSection} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIniSection</p>
 */
public class GrafanaWorkspaceIniSection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("propertys")
    private java.util.List < GrafanaWorkspaceIniProperty > propertys;

    @com.aliyun.core.annotation.NameInMap("section")
    private String section;

    private GrafanaWorkspaceIniSection(Builder builder) {
        this.propertys = builder.propertys;
        this.section = builder.section;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIniSection create() {
        return builder().build();
    }

    /**
     * @return propertys
     */
    public java.util.List < GrafanaWorkspaceIniProperty > getPropertys() {
        return this.propertys;
    }

    /**
     * @return section
     */
    public String getSection() {
        return this.section;
    }

    public static final class Builder {
        private java.util.List < GrafanaWorkspaceIniProperty > propertys; 
        private String section; 

        /**
         * propertys.
         */
        public Builder propertys(java.util.List < GrafanaWorkspaceIniProperty > propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * section.
         */
        public Builder section(String section) {
            this.section = section;
            return this;
        }

        public GrafanaWorkspaceIniSection build() {
            return new GrafanaWorkspaceIniSection(this);
        } 

    } 

}
