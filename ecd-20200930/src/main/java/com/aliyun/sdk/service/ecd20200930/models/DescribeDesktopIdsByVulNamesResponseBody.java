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
 * {@link DescribeDesktopIdsByVulNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopIdsByVulNamesResponseBody</p>
 */
public class DescribeDesktopIdsByVulNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopItems")
    private java.util.List<DesktopItems> desktopItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopItems
     */
    public java.util.List<DesktopItems> getDesktopItems() {
        return this.desktopItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DesktopItems> desktopItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDesktopIdsByVulNamesResponseBody model) {
            this.desktopItems = model.desktopItems;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The array of cloud desktop information.</p>
         */
        public Builder desktopItems(java.util.List<DesktopItems> desktopItems) {
            this.desktopItems = desktopItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopIdsByVulNamesResponseBody build() {
            return new DescribeDesktopIdsByVulNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopIdsByVulNamesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopIdsByVulNamesResponseBody</p>
     */
    public static class DesktopItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
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

            private Builder() {
            } 

            private Builder(DesktopItems model) {
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
            } 

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-138dsptkrt00u****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>Graphics-21</p>
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
