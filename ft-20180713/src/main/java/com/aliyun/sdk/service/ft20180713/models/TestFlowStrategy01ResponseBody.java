// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestFlowStrategy01ResponseBody} extends {@link TeaModel}
 *
 * <p>TestFlowStrategy01ResponseBody</p>
 */
public class TestFlowStrategy01ResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < String > list;

    @NameInMap("Names")
    private java.util.List < String > names;

    @NameInMap("RequestId")
    private String requestId;

    private TestFlowStrategy01ResponseBody(Builder builder) {
        this.list = builder.list;
        this.names = builder.names;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestFlowStrategy01ResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < String > getList() {
        return this.list;
    }

    /**
     * @return names
     */
    public java.util.List < String > getNames() {
        return this.names;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > list; 
        private java.util.List < String > names; 
        private String requestId; 

        /**
         * List.
         */
        public Builder list(java.util.List < String > list) {
            this.list = list;
            return this;
        }

        /**
         * Names.
         */
        public Builder names(java.util.List < String > names) {
            this.names = names;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TestFlowStrategy01ResponseBody build() {
            return new TestFlowStrategy01ResponseBody(this);
        } 

    } 

}
