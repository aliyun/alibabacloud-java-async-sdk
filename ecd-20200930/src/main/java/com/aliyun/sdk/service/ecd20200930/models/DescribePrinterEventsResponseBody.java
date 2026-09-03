// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribePrinterEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrinterEventsResponseBody</p>
 */
public class DescribePrinterEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrinterEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrinterEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Events> events; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePrinterEventsResponseBody model) {
            this.events = model.events;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Events.
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrinterEventsResponseBody build() {
            return new DescribePrinterEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrinterEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrinterEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("PrinterDriver")
        private String printerDriver;

        @com.aliyun.core.annotation.NameInMap("PrinterJobCopies")
        private Integer printerJobCopies;

        @com.aliyun.core.annotation.NameInMap("PrinterJobName")
        private String printerJobName;

        @com.aliyun.core.annotation.NameInMap("PrinterJobPages")
        private Integer printerJobPages;

        @com.aliyun.core.annotation.NameInMap("PrinterJobPrintedPages")
        private Integer printerJobPrintedPages;

        @com.aliyun.core.annotation.NameInMap("PrinterJobSize")
        private Long printerJobSize;

        @com.aliyun.core.annotation.NameInMap("PrinterJobTime")
        private Long printerJobTime;

        @com.aliyun.core.annotation.NameInMap("PrinterName")
        private String printerName;

        @com.aliyun.core.annotation.NameInMap("PrinterPort")
        private String printerPort;

        @com.aliyun.core.annotation.NameInMap("PrinterRedirType")
        private Integer printerRedirType;

        private Events(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endUserId = builder.endUserId;
            this.eventId = builder.eventId;
            this.printerDriver = builder.printerDriver;
            this.printerJobCopies = builder.printerJobCopies;
            this.printerJobName = builder.printerJobName;
            this.printerJobPages = builder.printerJobPages;
            this.printerJobPrintedPages = builder.printerJobPrintedPages;
            this.printerJobSize = builder.printerJobSize;
            this.printerJobTime = builder.printerJobTime;
            this.printerName = builder.printerName;
            this.printerPort = builder.printerPort;
            this.printerRedirType = builder.printerRedirType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return printerDriver
         */
        public String getPrinterDriver() {
            return this.printerDriver;
        }

        /**
         * @return printerJobCopies
         */
        public Integer getPrinterJobCopies() {
            return this.printerJobCopies;
        }

        /**
         * @return printerJobName
         */
        public String getPrinterJobName() {
            return this.printerJobName;
        }

        /**
         * @return printerJobPages
         */
        public Integer getPrinterJobPages() {
            return this.printerJobPages;
        }

        /**
         * @return printerJobPrintedPages
         */
        public Integer getPrinterJobPrintedPages() {
            return this.printerJobPrintedPages;
        }

        /**
         * @return printerJobSize
         */
        public Long getPrinterJobSize() {
            return this.printerJobSize;
        }

        /**
         * @return printerJobTime
         */
        public Long getPrinterJobTime() {
            return this.printerJobTime;
        }

        /**
         * @return printerName
         */
        public String getPrinterName() {
            return this.printerName;
        }

        /**
         * @return printerPort
         */
        public String getPrinterPort() {
            return this.printerPort;
        }

        /**
         * @return printerRedirType
         */
        public Integer getPrinterRedirType() {
            return this.printerRedirType;
        }

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 
            private String endUserId; 
            private String eventId; 
            private String printerDriver; 
            private Integer printerJobCopies; 
            private String printerJobName; 
            private Integer printerJobPages; 
            private Integer printerJobPrintedPages; 
            private Long printerJobSize; 
            private Long printerJobTime; 
            private String printerName; 
            private String printerPort; 
            private Integer printerRedirType; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.endUserId = model.endUserId;
                this.eventId = model.eventId;
                this.printerDriver = model.printerDriver;
                this.printerJobCopies = model.printerJobCopies;
                this.printerJobName = model.printerJobName;
                this.printerJobPages = model.printerJobPages;
                this.printerJobPrintedPages = model.printerJobPrintedPages;
                this.printerJobSize = model.printerJobSize;
                this.printerJobTime = model.printerJobTime;
                this.printerName = model.printerName;
                this.printerPort = model.printerPort;
                this.printerRedirType = model.printerRedirType;
            } 

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * PrinterDriver.
             */
            public Builder printerDriver(String printerDriver) {
                this.printerDriver = printerDriver;
                return this;
            }

            /**
             * PrinterJobCopies.
             */
            public Builder printerJobCopies(Integer printerJobCopies) {
                this.printerJobCopies = printerJobCopies;
                return this;
            }

            /**
             * PrinterJobName.
             */
            public Builder printerJobName(String printerJobName) {
                this.printerJobName = printerJobName;
                return this;
            }

            /**
             * PrinterJobPages.
             */
            public Builder printerJobPages(Integer printerJobPages) {
                this.printerJobPages = printerJobPages;
                return this;
            }

            /**
             * PrinterJobPrintedPages.
             */
            public Builder printerJobPrintedPages(Integer printerJobPrintedPages) {
                this.printerJobPrintedPages = printerJobPrintedPages;
                return this;
            }

            /**
             * PrinterJobSize.
             */
            public Builder printerJobSize(Long printerJobSize) {
                this.printerJobSize = printerJobSize;
                return this;
            }

            /**
             * PrinterJobTime.
             */
            public Builder printerJobTime(Long printerJobTime) {
                this.printerJobTime = printerJobTime;
                return this;
            }

            /**
             * PrinterName.
             */
            public Builder printerName(String printerName) {
                this.printerName = printerName;
                return this;
            }

            /**
             * PrinterPort.
             */
            public Builder printerPort(String printerPort) {
                this.printerPort = printerPort;
                return this;
            }

            /**
             * PrinterRedirType.
             */
            public Builder printerRedirType(Integer printerRedirType) {
                this.printerRedirType = printerRedirType;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
