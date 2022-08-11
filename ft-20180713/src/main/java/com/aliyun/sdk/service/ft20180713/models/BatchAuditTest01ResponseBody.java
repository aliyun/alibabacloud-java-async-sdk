// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAuditTest01ResponseBody} extends {@link TeaModel}
 *
 * <p>BatchAuditTest01ResponseBody</p>
 */
public class BatchAuditTest01ResponseBody extends TeaModel {
    @NameInMap("Demo01")
    private Demo01 demo01;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    private BatchAuditTest01ResponseBody(Builder builder) {
        this.demo01 = builder.demo01;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAuditTest01ResponseBody create() {
        return builder().build();
    }

    /**
     * @return demo01
     */
    public Demo01 getDemo01() {
        return this.demo01;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Demo01 demo01; 
        private String name; 
        private String requestId; 

        /**
         * Demo01.
         */
        public Builder demo01(Demo01 demo01) {
            this.demo01 = demo01;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchAuditTest01ResponseBody build() {
            return new BatchAuditTest01ResponseBody(this);
        } 

    } 

    public static class Demo011 extends TeaModel {
        @NameInMap("Demo0111")
        private String demo0111;

        private Demo011(Builder builder) {
            this.demo0111 = builder.demo0111;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demo011 create() {
            return builder().build();
        }

        /**
         * @return demo0111
         */
        public String getDemo0111() {
            return this.demo0111;
        }

        public static final class Builder {
            private String demo0111; 

            /**
             * Demo0111.
             */
            public Builder demo0111(String demo0111) {
                this.demo0111 = demo0111;
                return this;
            }

            public Demo011 build() {
                return new Demo011(this);
            } 

        } 

    }
    public static class Demo01Demo011 extends TeaModel {
        @NameInMap("Demo011")
        private java.util.List < Demo011> demo011;

        private Demo01Demo011(Builder builder) {
            this.demo011 = builder.demo011;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demo01Demo011 create() {
            return builder().build();
        }

        /**
         * @return demo011
         */
        public java.util.List < Demo011> getDemo011() {
            return this.demo011;
        }

        public static final class Builder {
            private java.util.List < Demo011> demo011; 

            /**
             * Demo011.
             */
            public Builder demo011(java.util.List < Demo011> demo011) {
                this.demo011 = demo011;
                return this;
            }

            public Demo01Demo011 build() {
                return new Demo01Demo011(this);
            } 

        } 

    }
    public static class Demo01 extends TeaModel {
        @NameInMap("Demo011")
        private Demo01Demo011 demo011;

        private Demo01(Builder builder) {
            this.demo011 = builder.demo011;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demo01 create() {
            return builder().build();
        }

        /**
         * @return demo011
         */
        public Demo01Demo011 getDemo011() {
            return this.demo011;
        }

        public static final class Builder {
            private Demo01Demo011 demo011; 

            /**
             * Demo011.
             */
            public Builder demo011(Demo01Demo011 demo011) {
                this.demo011 = demo011;
                return this;
            }

            public Demo01 build() {
                return new Demo01(this);
            } 

        } 

    }
}
