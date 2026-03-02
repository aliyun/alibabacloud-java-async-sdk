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
 * {@link PbcSubscribe} extends {@link TeaModel}
 *
 * <p>PbcSubscribe</p>
 */
public class PbcSubscribe extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("developerId")
    private String developerId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("purpose")
    private String purpose;

    @com.aliyun.core.annotation.NameInMap("subPbcName")
    private String subPbcName;

    private PbcSubscribe(Builder builder) {
        this.developerId = builder.developerId;
        this.id = builder.id;
        this.pbcName = builder.pbcName;
        this.purpose = builder.purpose;
        this.subPbcName = builder.subPbcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcSubscribe create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return developerId
     */
    public String getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return subPbcName
     */
    public String getSubPbcName() {
        return this.subPbcName;
    }

    public static final class Builder {
        private String developerId; 
        private Long id; 
        private String pbcName; 
        private String purpose; 
        private String subPbcName; 

        private Builder() {
        } 

        private Builder(PbcSubscribe model) {
            this.developerId = model.developerId;
            this.id = model.id;
            this.pbcName = model.pbcName;
            this.purpose = model.purpose;
            this.subPbcName = model.subPbcName;
        } 

        /**
         * developerId.
         */
        public Builder developerId(String developerId) {
            this.developerId = developerId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * purpose.
         */
        public Builder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * subPbcName.
         */
        public Builder subPbcName(String subPbcName) {
            this.subPbcName = subPbcName;
            return this;
        }

        public PbcSubscribe build() {
            return new PbcSubscribe(this);
        } 

    } 

}
