// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAuditTest01Request} extends {@link RequestModel}
 *
 * <p>BatchAuditTest01Request</p>
 */
public class BatchAuditTest01Request extends Request {
    @Query
    @NameInMap("BatchAuditTest01")
    private String batchAuditTest01;

    @Query
    @NameInMap("Demo01")
    private String demo01;

    @Query
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Test010101")
    private Boolean test010101;

    private BatchAuditTest01Request(Builder builder) {
        super(builder);
        this.batchAuditTest01 = builder.batchAuditTest01;
        this.demo01 = builder.demo01;
        this.name = builder.name;
        this.test010101 = builder.test010101;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAuditTest01Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchAuditTest01
     */
    public String getBatchAuditTest01() {
        return this.batchAuditTest01;
    }

    /**
     * @return demo01
     */
    public String getDemo01() {
        return this.demo01;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return test010101
     */
    public Boolean getTest010101() {
        return this.test010101;
    }

    public static final class Builder extends Request.Builder<BatchAuditTest01Request, Builder> {
        private String batchAuditTest01; 
        private String demo01; 
        private String name; 
        private Boolean test010101; 

        private Builder() {
            super();
        } 

        private Builder(BatchAuditTest01Request request) {
            super(request);
            this.batchAuditTest01 = request.batchAuditTest01;
            this.demo01 = request.demo01;
            this.name = request.name;
            this.test010101 = request.test010101;
        } 

        /**
         * BatchAuditTest01.
         */
        public Builder batchAuditTest01(String batchAuditTest01) {
            this.putQueryParameter("BatchAuditTest01", batchAuditTest01);
            this.batchAuditTest01 = batchAuditTest01;
            return this;
        }

        /**
         * Demo01.
         */
        public Builder demo01(String demo01) {
            this.putQueryParameter("Demo01", demo01);
            this.demo01 = demo01;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Test010101.
         */
        public Builder test010101(Boolean test010101) {
            this.putBodyParameter("Test010101", test010101);
            this.test010101 = test010101;
            return this;
        }

        @Override
        public BatchAuditTest01Request build() {
            return new BatchAuditTest01Request(this);
        } 

    } 

}
