// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeCloudGtmSystemLinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmSystemLinesResponseBody</p>
 */
public class DescribeCloudGtmSystemLinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemLines")
    private SystemLines systemLines;

    @com.aliyun.core.annotation.NameInMap("SystemLinesTree")
    private String systemLinesTree;

    private DescribeCloudGtmSystemLinesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemLines = builder.systemLines;
        this.systemLinesTree = builder.systemLinesTree;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmSystemLinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemLines
     */
    public SystemLines getSystemLines() {
        return this.systemLines;
    }

    /**
     * @return systemLinesTree
     */
    public String getSystemLinesTree() {
        return this.systemLinesTree;
    }

    public static final class Builder {
        private String requestId; 
        private SystemLines systemLines; 
        private String systemLinesTree; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The system lines.</p>
         */
        public Builder systemLines(SystemLines systemLines) {
            this.systemLines = systemLines;
            return this;
        }

        /**
         * <p>The system lines, which are in a tree structure. Only a system line is listed in this example.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;displayName&quot;:&quot;Default&quot;,&quot;id&quot;:&quot;default&quot;,&quot;isAvailable&quot;:true,&quot;name&quot;:&quot;Default&quot;,&quot;parentId&quot;:&quot;&quot;}]</p>
         */
        public Builder systemLinesTree(String systemLinesTree) {
            this.systemLinesTree = systemLinesTree;
            return this;
        }

        public DescribeCloudGtmSystemLinesResponseBody build() {
            return new DescribeCloudGtmSystemLinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudGtmSystemLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmSystemLinesResponseBody</p>
     */
    public static class SystemLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentCode")
        private String parentCode;

        private SystemLine(Builder builder) {
            this.code = builder.code;
            this.displayName = builder.displayName;
            this.isAvailable = builder.isAvailable;
            this.name = builder.name;
            this.parentCode = builder.parentCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemLine create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentCode
         */
        public String getParentCode() {
            return this.parentCode;
        }

        public static final class Builder {
            private String code; 
            private String displayName; 
            private Boolean isAvailable; 
            private String name; 
            private String parentCode; 

            /**
             * <p>The line code.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_r_ap-south-1</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The display name of the line.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether the line can be selected as the source of a Domain Name System (DNS) request. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>The name of the line.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The code of the parent line.</p>
             * 
             * <strong>example:</strong>
             * <p>String	aliyun</p>
             */
            public Builder parentCode(String parentCode) {
                this.parentCode = parentCode;
                return this;
            }

            public SystemLine build() {
                return new SystemLine(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmSystemLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmSystemLinesResponseBody</p>
     */
    public static class SystemLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemLine")
        private java.util.List<SystemLine> systemLine;

        private SystemLines(Builder builder) {
            this.systemLine = builder.systemLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemLines create() {
            return builder().build();
        }

        /**
         * @return systemLine
         */
        public java.util.List<SystemLine> getSystemLine() {
            return this.systemLine;
        }

        public static final class Builder {
            private java.util.List<SystemLine> systemLine; 

            /**
             * SystemLine.
             */
            public Builder systemLine(java.util.List<SystemLine> systemLine) {
                this.systemLine = systemLine;
                return this;
            }

            public SystemLines build() {
                return new SystemLines(this);
            } 

        } 

    }
}
