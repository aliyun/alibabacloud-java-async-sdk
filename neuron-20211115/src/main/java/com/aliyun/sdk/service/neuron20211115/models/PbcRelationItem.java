// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcRelationItem} extends {@link TeaModel}
 *
 * <p>PbcRelationItem</p>
 */
public class PbcRelationItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("company")
    private String company;

    @com.aliyun.core.annotation.NameInMap("developer")
    private String developer;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("pbcVersion")
    private String pbcVersion;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    private PbcRelationItem(Builder builder) {
        this.company = builder.company;
        this.developer = builder.developer;
        this.pbcName = builder.pbcName;
        this.pbcVersion = builder.pbcVersion;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcRelationItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return developer
     */
    public String getDeveloper() {
        return this.developer;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return pbcVersion
     */
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private String company; 
        private String developer; 
        private String pbcName; 
        private String pbcVersion; 
        private String summary; 

        private Builder() {
        } 

        private Builder(PbcRelationItem model) {
            this.company = model.company;
            this.developer = model.developer;
            this.pbcName = model.pbcName;
            this.pbcVersion = model.pbcVersion;
            this.summary = model.summary;
        } 

        /**
         * company.
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * developer.
         */
        public Builder developer(String developer) {
            this.developer = developer;
            return this;
        }

        /**
         * pbcName.
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
            return this;
        }

        /**
         * pbcVersion.
         */
        public Builder pbcVersion(String pbcVersion) {
            this.pbcVersion = pbcVersion;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public PbcRelationItem build() {
            return new PbcRelationItem(this);
        } 

    } 

}
