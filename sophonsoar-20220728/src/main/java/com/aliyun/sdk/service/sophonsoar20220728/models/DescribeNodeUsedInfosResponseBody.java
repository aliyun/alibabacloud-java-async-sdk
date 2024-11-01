// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeNodeUsedInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeUsedInfosResponseBody</p>
 */
public class DescribeNodeUsedInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeUsedInfos")
    private String nodeUsedInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNodeUsedInfosResponseBody(Builder builder) {
        this.nodeUsedInfos = builder.nodeUsedInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeUsedInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeUsedInfos
     */
    public String getNodeUsedInfos() {
        return this.nodeUsedInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nodeUsedInfos; 
        private String requestId; 

        /**
         * <p>The node reference information. The value is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>action</strong>: the referencing action. This field contains the following information:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the referencing node.</li>
         * <li><strong>inputParams</strong>: the parameter settings of the referencing node.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;action&quot;: [
         *         {
         *             &quot;name&quot;: &quot;query_books&quot;,
         *             &quot;inputParams&quot;: [
         *                 {
         *                     &quot;referInfos&quot;: [
         *                         &quot;${play_group.datalist.*.ids}&quot;
         *                     ],
         *                     &quot;name&quot;: &quot;querySql&quot;
         *                 }
         *             ]
         *         }
         *     ]
         * }</p>
         */
        public Builder nodeUsedInfos(String nodeUsedInfos) {
            this.nodeUsedInfos = nodeUsedInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3B10F836-C2B1-54FA-AB59-7591B548FB59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodeUsedInfosResponseBody build() {
            return new DescribeNodeUsedInfosResponseBody(this);
        } 

    } 

}
