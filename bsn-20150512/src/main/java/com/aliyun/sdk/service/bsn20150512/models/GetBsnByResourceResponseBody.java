// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bsn20150512.models;

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
 * {@link GetBsnByResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetBsnByResourceResponseBody</p>
 */
public class GetBsnByResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("datas")
    private Datas datas;

    private GetBsnByResourceResponseBody(Builder builder) {
        this.datas = builder.datas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBsnByResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datas
     */
    public Datas getDatas() {
        return this.datas;
    }

    public static final class Builder {
        private Datas datas; 

        private Builder() {
        } 

        private Builder(GetBsnByResourceResponseBody model) {
            this.datas = model.datas;
        } 

        /**
         * datas.
         */
        public Builder datas(Datas datas) {
            this.datas = datas;
            return this;
        }

        public GetBsnByResourceResponseBody build() {
            return new GetBsnByResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBsnByResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetBsnByResourceResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bsnDO")
        private java.util.List<String> bsnDO;

        private Datas(Builder builder) {
            this.bsnDO = builder.bsnDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return bsnDO
         */
        public java.util.List<String> getBsnDO() {
            return this.bsnDO;
        }

        public static final class Builder {
            private java.util.List<String> bsnDO; 

            private Builder() {
            } 

            private Builder(Datas model) {
                this.bsnDO = model.bsnDO;
            } 

            /**
             * bsnDO.
             */
            public Builder bsnDO(java.util.List<String> bsnDO) {
                this.bsnDO = bsnDO;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
