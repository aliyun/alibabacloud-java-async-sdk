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
 * {@link ListCompressFileDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCompressFileDetectResultResponseBody</p>
 */
public class ListCompressFileDetectResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultList")
    private java.util.List<ResultList> resultList;

    private ListCompressFileDetectResultResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompressFileDetectResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List<ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<ResultList> resultList; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detection results of files.</p>
         */
        public Builder resultList(java.util.List<ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public ListCompressFileDetectResultResponseBody build() {
            return new ListCompressFileDetectResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCompressFileDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompressFileDetectResultResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCompressFileDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompressFileDetectResultResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("HashKey")
        private String hashKey;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("VirusType")
        private String virusType;

        private ResultList(Builder builder) {
            this.ext = builder.ext;
            this.hashKey = builder.hashKey;
            this.path = builder.path;
            this.result = builder.result;
            this.score = builder.score;
            this.virusType = builder.virusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return virusType
         */
        public String getVirusType() {
            return this.virusType;
        }

        public static final class Builder {
            private String ext; 
            private String hashKey; 
            private String path; 
            private Integer result; 
            private Integer score; 
            private String virusType; 

            /**
             * <p>The extended information about the file detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;HighLight&quot;:
             *     [
             *         [
             *             23245,
             *             23212
             *         ]
             *     ],
             *     &quot;FileLabel&quot;:
             *     [
             *         &quot;PE32&quot;,
             *         &quot;Zip&quot;,
             *         &quot;SFX&quot;,
             *         &quot;encrypted&quot;
             *     ]
             * }</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The identifier of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>0a212417e65c26ff133cfff28f6c****</p>
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * <p>The path to the file within the package.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/1.zip/test****</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The file detection result. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The file is normal.</li>
             * <li><strong>1</strong>: The file is suspicious.</li>
             * <li><strong>3</strong>: The detection is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The score of the file detection result. The following list describes mappings between the score ranges and risk levels:</p>
             * <ul>
             * <li>0 to 60: normal</li>
             * <li>61 to 70: risky</li>
             * <li>71 to 80: suspicious</li>
             * <li>81 to 100: malicious</li>
             * </ul>
             * <blockquote>
             * <p> A higher score indicates a more suspicious file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The type of the virus. Valid values:</p>
             * <ul>
             * <li><strong>Trojan</strong>: self-mutating trojan</li>
             * <li><strong>WebShell</strong>: webshell</li>
             * <li><strong>Backdoor</strong>: backdoor program</li>
             * <li><strong>RansomWare</strong>: ransomware</li>
             * <li><strong>Scanner</strong>: scanner</li>
             * <li><strong>Stealer</strong>: tool that is used to steal information</li>
             * <li><strong>Malbaseware</strong>: tainted basic software</li>
             * <li><strong>Hacktool</strong>: attacker tool</li>
             * <li><strong>Engtest</strong>: engine test program</li>
             * <li><strong>Downloader</strong>: trojan downloader</li>
             * <li><strong>Virus</strong>: infectious virus</li>
             * <li><strong>Miner</strong>: mining program</li>
             * <li><strong>Worm</strong>: worm</li>
             * <li><strong>DDoS</strong>: DDoS trojan</li>
             * <li><strong>Malware</strong>: malicious program</li>
             * <li><strong>Backdoor</strong>: reverse shell</li>
             * <li><strong>RiskWare</strong>: software that has risks</li>
             * <li><strong>Proxytool</strong>: proxy</li>
             * <li><strong>Suspicious</strong>: suspicious program</li>
             * <li><strong>MalScript</strong>: malicious script</li>
             * <li><strong>Rootkit</strong>: rootkit</li>
             * <li><strong>Exploit</strong>: exploit</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WebShell</p>
             */
            public Builder virusType(String virusType) {
                this.virusType = virusType;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
