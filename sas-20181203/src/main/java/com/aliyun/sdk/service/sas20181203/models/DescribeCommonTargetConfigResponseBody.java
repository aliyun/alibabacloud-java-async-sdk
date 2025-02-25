// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCommonTargetConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonTargetConfigResponseBody</p>
 */
public class DescribeCommonTargetConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetList")
    private java.util.List<TargetList> targetList;

    private DescribeCommonTargetConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetList = builder.targetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonTargetConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetList
     */
    public java.util.List<TargetList> getTargetList() {
        return this.targetList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TargetList> targetList; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the configuration items.</p>
         */
        public Builder targetList(java.util.List<TargetList> targetList) {
            this.targetList = targetList;
            return this;
        }

        public DescribeCommonTargetConfigResponseBody build() {
            return new DescribeCommonTargetConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonTargetConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonTargetConfigResponseBody</p>
     */
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private TargetList(Builder builder) {
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * <p>The mode in which the configuration takes effect. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: In this mode, the configuration takes effect on the assets.</li>
             * <li><strong>del</strong>: In this mode, the configuration does not take effect on the assets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The ID of the asset on which the configuration takes effect.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>When you set the <strong>TargetType</strong> parameter to <strong>uuid</strong>, the value of this parameter indicates the UUID of an asset.</p>
             * </li>
             * <li><p>When you set the <strong>TargetType</strong> parameter to <strong>Cluster</strong>, the value of this parameter indicates the ID of a cluster.</p>
             * </li>
             * <li><p>When you set the <strong>TargetType</strong> parameter to <strong>image_repo</strong>, the value of this parameter indicates the ID of an image repository.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>c23551de6149343e8a54e69fbefe6****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The dimension from on which the feature was configured. Valid values:</p>
             * <ul>
             * <li><strong>uuid</strong>: the UUID of the asset</li>
             * <li><strong>Cluster</strong>: the ID of the cluster</li>
             * <li><strong>image_repo</strong>: the ID of the image repository</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>image_repo</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
}
