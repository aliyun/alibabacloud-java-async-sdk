// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetHistogramsResponse} extends {@link TeaModel}
 *
 * <p>GetHistogramsResponse</p>
 */
public class GetHistogramsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < GetHistogramsResponseBody> body;

    private GetHistogramsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetHistogramsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List < GetHistogramsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistogramsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < GetHistogramsResponseBody> body);

        @Override
        GetHistogramsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistogramsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < GetHistogramsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistogramsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < GetHistogramsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistogramsResponse build() {
            return new GetHistogramsResponse(this);
        } 

    } 

    public static class GetHistogramsResponseBody extends TeaModel {
        @NameInMap("from")
        private Long from;

        @NameInMap("to")
        private Long to;

        @NameInMap("count")
        private Long count;

        @NameInMap("progress")
        private String progress;

        private GetHistogramsResponseBody(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
            this.count = builder.count;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetHistogramsResponseBody create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Long getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Long getTo() {
            return this.to;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Long from; 
            private Long to; 
            private Long count; 
            private String progress; 

            /**
             * The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             * <p>
             * 
             * The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned.
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             * <p>
             * 
             * The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned.
             */
            public Builder to(Long to) {
                this.to = to;
                return this;
            }

            /**
             * The number of logs that are generated within the subinterval.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Indicates whether the query and analysis results in the subinterval is complete. Valid values:
             * <p>
             * 
             * Complete: The query is successful, and the complete query and analysis results are returned.
             * 
             * Incomplete: The query is successful, but the query and analysis results are incomplete. To obtain the complete results, you must repeat the request.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public GetHistogramsResponseBody build() {
                return new GetHistogramsResponseBody(this);
            } 

        } 

    }
}
