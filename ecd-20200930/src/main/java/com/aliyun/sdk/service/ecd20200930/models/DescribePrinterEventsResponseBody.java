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
         * <p>The user events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The pagination token for the next query. If NextToken is empty, no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E54EB497-D7B7-5F04-B744-D8DFA7B******</p>
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
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-8fupvkhg0aayu****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>desktop-001</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5651188b-3070-d1cc-5311-75753d59****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The printer driver name.</p>
             * 
             * <strong>example:</strong>
             * <p>HP LaserJet PCL 6</p>
             */
            public Builder printerDriver(String printerDriver) {
                this.printerDriver = printerDriver;
                return this;
            }

            /**
             * <p>The number of copies to print.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder printerJobCopies(Integer printerJobCopies) {
                this.printerJobCopies = printerJobCopies;
                return this;
            }

            /**
             * <p>The print job name.</p>
             * 
             * <strong>example:</strong>
             * <p>report.pdf</p>
             */
            public Builder printerJobName(String printerJobName) {
                this.printerJobName = printerJobName;
                return this;
            }

            /**
             * <p>The total number of pages in the print job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder printerJobPages(Integer printerJobPages) {
                this.printerJobPages = printerJobPages;
                return this;
            }

            /**
             * <p>The number of printed pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder printerJobPrintedPages(Integer printerJobPrintedPages) {
                this.printerJobPrintedPages = printerJobPrintedPages;
                return this;
            }

            /**
             * <p>The print job size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2632446</p>
             */
            public Builder printerJobSize(Long printerJobSize) {
                this.printerJobSize = printerJobSize;
                return this;
            }

            /**
             * <p>The print job time, in millisecond-precision UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1706140800000</p>
             */
            public Builder printerJobTime(Long printerJobTime) {
                this.printerJobTime = printerJobTime;
                return this;
            }

            /**
             * <p>The printer name.</p>
             * 
             * <strong>example:</strong>
             * <p>HP LaserJet Pro</p>
             */
            public Builder printerName(String printerName) {
                this.printerName = printerName;
                return this;
            }

            /**
             * <p>The printer port.</p>
             * 
             * <strong>example:</strong>
             * <p>USB001</p>
             */
            public Builder printerPort(String printerPort) {
                this.printerPort = printerPort;
                return this;
            }

            /**
             * <p>The printer redirection type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
