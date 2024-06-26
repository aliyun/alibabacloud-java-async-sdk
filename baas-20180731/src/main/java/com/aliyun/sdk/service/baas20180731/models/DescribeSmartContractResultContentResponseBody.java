// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmartContractResultContentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartContractResultContentResponseBody</p>
 */
public class DescribeSmartContractResultContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSmartContractResultContentResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartContractResultContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSmartContractResultContentResponseBody build() {
            return new DescribeSmartContractResultContentResponseBody(this);
        } 

    } 

    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Character")
        private Integer character;

        @com.aliyun.core.annotation.NameInMap("Line")
        private Integer line;

        private Range(Builder builder) {
            this.character = builder.character;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return character
         */
        public Integer getCharacter() {
            return this.character;
        }

        /**
         * @return line
         */
        public Integer getLine() {
            return this.line;
        }

        public static final class Builder {
            private Integer character; 
            private Integer line; 

            /**
             * Character.
             */
            public Builder character(Integer character) {
                this.character = character;
                return this;
            }

            /**
             * Line.
             */
            public Builder line(Integer line) {
                this.line = line;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    public static class LocationRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Character")
        private Integer character;

        @com.aliyun.core.annotation.NameInMap("Line")
        private Integer line;

        private LocationRange(Builder builder) {
            this.character = builder.character;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationRange create() {
            return builder().build();
        }

        /**
         * @return character
         */
        public Integer getCharacter() {
            return this.character;
        }

        /**
         * @return line
         */
        public Integer getLine() {
            return this.line;
        }

        public static final class Builder {
            private Integer character; 
            private Integer line; 

            /**
             * Character.
             */
            public Builder character(Integer character) {
                this.character = character;
                return this;
            }

            /**
             * Line.
             */
            public Builder line(Integer line) {
                this.line = line;
                return this;
            }

            public LocationRange build() {
                return new LocationRange(this);
            } 

        } 

    }
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Range")
        private java.util.List < LocationRange> range;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Location(Builder builder) {
            this.range = builder.range;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return range
         */
        public java.util.List < LocationRange> getRange() {
            return this.range;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private java.util.List < LocationRange> range; 
            private String uri; 

            /**
             * Range.
             */
            public Builder range(java.util.List < LocationRange> range) {
                this.range = range;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    public static class Trace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private Location location;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Trace(Builder builder) {
            this.location = builder.location;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trace create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Location location; 
            private String message; 

            /**
             * Location.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Trace build() {
                return new Trace(this);
            } 

        } 

    }
    public static class Diagnostics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private String advice;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Range")
        private java.util.List < Range> range;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private Integer severity;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Trace")
        private java.util.List < Trace> trace;

        private Diagnostics(Builder builder) {
            this.advice = builder.advice;
            this.code = builder.code;
            this.detail = builder.detail;
            this.message = builder.message;
            this.range = builder.range;
            this.severity = builder.severity;
            this.source = builder.source;
            this.trace = builder.trace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diagnostics create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public String getAdvice() {
            return this.advice;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return range
         */
        public java.util.List < Range> getRange() {
            return this.range;
        }

        /**
         * @return severity
         */
        public Integer getSeverity() {
            return this.severity;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return trace
         */
        public java.util.List < Trace> getTrace() {
            return this.trace;
        }

        public static final class Builder {
            private String advice; 
            private String code; 
            private String detail; 
            private String message; 
            private java.util.List < Range> range; 
            private Integer severity; 
            private String source; 
            private java.util.List < Trace> trace; 

            /**
             * Advice.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(java.util.List < Range> range) {
                this.range = range;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(Integer severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Trace.
             */
            public Builder trace(java.util.List < Trace> trace) {
                this.trace = trace;
                return this;
            }

            public Diagnostics build() {
                return new Diagnostics(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Diagnostics")
        private java.util.List < Diagnostics> diagnostics;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Result(Builder builder) {
            this.diagnostics = builder.diagnostics;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return diagnostics
         */
        public java.util.List < Diagnostics> getDiagnostics() {
            return this.diagnostics;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private java.util.List < Diagnostics> diagnostics; 
            private String uri; 

            /**
             * Diagnostics.
             */
            public Builder diagnostics(java.util.List < Diagnostics> diagnostics) {
                this.diagnostics = diagnostics;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
