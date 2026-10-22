// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProfileResponseBody</p>
 */
public class DescribeProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("ProfileSummary")
    private Object profileSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProfileResponseBody(Builder builder) {
        this.profile = builder.profile;
        this.profileSummary = builder.profileSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProfileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return profileSummary
     */
    public Object getProfileSummary() {
        return this.profileSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String profile; 
        private Object profileSummary; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeProfileResponseBody model) {
            this.profile = model.profile;
            this.profileSummary = model.profileSummary;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The profile text. This parameter is not yet supported.</p>
         * 
         * <strong>example:</strong>
         * <p>No Demo</p>
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>The profile summary.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;summary&quot;: {
         *       &quot;workloadGroup&quot;: &quot;normal&quot;,
         *       &quot;totalTime&quot;: &quot;16ms&quot;,
         *       &quot;totalTimeMs&quot;: 16,
         *       &quot;state&quot;: &quot;OK&quot;,
         *       &quot;queryId&quot;: &quot;8c7776d539f2426b-b0b654c7acc9bf8f&quot;,
         *       &quot;sql&quot;: &quot;SELECT * FROM demo_db.user_info WHERE status = 1&quot;
         *     },
         *     &quot;operators&quot;: [
         *       {
         *         &quot;pipeline&quot;: 0,
         *         &quot;frag&quot;: 0,
         *         &quot;skewRatio&quot;: 1,
         *         &quot;name&quot;: &quot;RESULT_SINK_OPERATOR&quot;,
         *         &quot;timePct&quot;: 0.34,
         *         &quot;inputRows&quot;: 4,
         *         &quot;execTimeAvgMs&quot;: 0.05
         *       },
         *       {
         *         &quot;pipeline&quot;: 0,
         *         &quot;frag&quot;: 0,
         *         &quot;name&quot;: &quot;OLAP_SCAN_OPERATOR(nereids_id=84. table_name=user_info(user_info))&quot;,
         *         &quot;timePct&quot;: 0,
         *         &quot;runtimeFilters&quot;: [
         *           &quot;RuntimeFilterInfo: sum , avg , max , min&quot;
         *         ],
         *         &quot;execTimeAvgMs&quot;: 0,
         *         &quot;table&quot;: &quot;demo_db.user_info&quot;
         *       }
         *     ],
         *     &quot;queryStats&quot;: {
         *       &quot;blockedOperators&quot;: 0,
         *       &quot;operatorCount&quot;: 2,
         *       &quot;spilledOperators&quot;: 0,
         *       &quot;fragmentCount&quot;: 2
         *     },
         *     &quot;fragments&quot;: [
         *       {
         *         &quot;pipelines&quot;: 1,
         *         &quot;instances&quot;: 1,
         *         &quot;execTimeMs&quot;: 0.05,
         *         &quot;id&quot;: 0
         *       },
         *       {
         *         &quot;pipelines&quot;: 0,
         *         &quot;instances&quot;: 0,
         *         &quot;execTimeMs&quot;: 0,
         *         &quot;id&quot;: 0
         *       }
         *     ],
         *     &quot;timeBreakdown&quot;: {
         *       &quot;schedule&quot;: &quot;4ms&quot;,
         *       &quot;parseSql&quot;: &quot;1ms&quot;,
         *       &quot;nereidsAnalysis&quot;: &quot;1ms&quot;,
         *       &quot;waitFetchResult&quot;: &quot;5ms&quot;,
         *       &quot;fetchResult&quot;: &quot;1ms&quot;,
         *       &quot;nereidsOptimize&quot;: &quot;N/A&quot;,
         *       &quot;plan&quot;: &quot;6ms&quot;,
         *       &quot;nereidsRewrite&quot;: &quot;1ms&quot;
         *     },
         *     &quot;scannedTables&quot;: {
         *       &quot;demoDb.userInfo&quot;: {
         *         &quot;totalSizeGb&quot;: 0,
         *         &quot;totalRows&quot;: 5,
         *         &quot;tabletSkew&quot;: 1.6,
         *         &quot;ddl&quot;: &quot;CREATE TABLE <code>user_info</code> xxx&quot;,
         *         &quot;tablets&quot;: 8
         *       }
         *     }
         *   }</p>
         */
        public Builder profileSummary(Object profileSummary) {
            this.profileSummary = profileSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProfileResponseBody build() {
            return new DescribeProfileResponseBody(this);
        } 

    } 

}
