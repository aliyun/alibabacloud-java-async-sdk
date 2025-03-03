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
 * {@link Relation} extends {@link TeaModel}
 *
 * <p>Relation</p>
 */
public class Relation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("LineageRelation")
    private LineageRelation lineageRelation;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private Relation(Builder builder) {
        this.errMsg = builder.errMsg;
        this.lineageRelation = builder.lineageRelation;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Relation create() {
        return builder().build();
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return lineageRelation
     */
    public LineageRelation getLineageRelation() {
        return this.lineageRelation;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String errMsg; 
        private LineageRelation lineageRelation; 
        private Boolean result; 

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * LineageRelation.
         */
        public Builder lineageRelation(LineageRelation lineageRelation) {
            this.lineageRelation = lineageRelation;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public Relation build() {
            return new Relation(this);
        } 

    } 

}
