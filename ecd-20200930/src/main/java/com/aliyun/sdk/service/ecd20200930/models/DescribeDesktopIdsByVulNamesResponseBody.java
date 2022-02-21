// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopIdsByVulNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopIdsByVulNamesResponseBody</p>
 */
public class DescribeDesktopIdsByVulNamesResponseBody extends TeaModel {
    @NameInMap("DesktopItems")
    private java.util.List < DesktopItems> desktopItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopIdsByVulNamesResponseBody(Builder builder) {
        this.desktopItems = builder.desktopItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopIdsByVulNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktopItems
     */
    public java.util.List < DesktopItems> getDesktopItems() {
        return this.desktopItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DesktopItems> desktopItems; 
        private String requestId; 

        /**
         * DesktopItems.
         */
        public Builder desktopItems(java.util.List < DesktopItems> desktopItems) {
            this.desktopItems = desktopItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopIdsByVulNamesResponseBody build() {
            return new DescribeDesktopIdsByVulNamesResponseBody(this);
        } 

    } 

    public static class DesktopItems extends TeaModel {
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        private DesktopItems(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopItems create() {
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

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 

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

            public DesktopItems build() {
                return new DesktopItems(this);
            } 

        } 

    }
}
