// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTableGenerationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTableGenerationsResponseBody</p>
 */
public class ListTableGenerationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListTableGenerationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableGenerationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>F6E3D968-529C-5C40-AFDD-133A8B8FD930</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListTableGenerationsResponseBody build() {
            return new ListTableGenerationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTableGenerationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTableGenerationsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generationId")
        private Long generationId;

        private Result(Builder builder) {
            this.generationId = builder.generationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return generationId
         */
        public Long getGenerationId() {
            return this.generationId;
        }

        public static final class Builder {
            private Long generationId; 

            /**
             * <p>The ID of the full index version.</p>
             * 
             * <strong>example:</strong>
             * <p>1708674867</p>
             */
            public Builder generationId(Long generationId) {
                this.generationId = generationId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
