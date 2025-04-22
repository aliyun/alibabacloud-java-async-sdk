// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CNameStatus} extends {@link TeaModel}
 *
 * <p>CNameStatus</p>
 */
public class CNameStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bingding_state")
    private String bingdingState;

    @com.aliyun.core.annotation.NameInMap("legal_state")
    private String legalState;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private CNameStatus(Builder builder) {
        this.bingdingState = builder.bingdingState;
        this.legalState = builder.legalState;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CNameStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bingdingState
     */
    public String getBingdingState() {
        return this.bingdingState;
    }

    /**
     * @return legalState
     */
    public String getLegalState() {
        return this.legalState;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder {
        private String bingdingState; 
        private String legalState; 
        private String remark; 

        private Builder() {
        } 

        private Builder(CNameStatus model) {
            this.bingdingState = model.bingdingState;
            this.legalState = model.legalState;
            this.remark = model.remark;
        } 

        /**
         * bingding_state.
         */
        public Builder bingdingState(String bingdingState) {
            this.bingdingState = bingdingState;
            return this;
        }

        /**
         * legal_state.
         */
        public Builder legalState(String legalState) {
            this.legalState = legalState;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public CNameStatus build() {
            return new CNameStatus(this);
        } 

    } 

}
