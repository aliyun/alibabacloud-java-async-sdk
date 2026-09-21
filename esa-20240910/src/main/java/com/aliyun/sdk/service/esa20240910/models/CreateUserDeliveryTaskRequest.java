// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateUserDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateUserDeliveryTaskRequest</p>
 */
public class CreateUserDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Details")
    private String details;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscardRate")
    private Float discardRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterVer")
    private String filterVer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HttpDelivery")
    private HttpDelivery httpDelivery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KafkaDelivery")
    private KafkaDelivery kafkaDelivery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssDelivery")
    private OssDelivery ossDelivery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("S3Delivery")
    private S3Delivery s3Delivery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsDelivery")
    private SlsDelivery slsDelivery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateUserDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.deliveryType = builder.deliveryType;
        this.details = builder.details;
        this.discardRate = builder.discardRate;
        this.fieldName = builder.fieldName;
        this.filterVer = builder.filterVer;
        this.httpDelivery = builder.httpDelivery;
        this.kafkaDelivery = builder.kafkaDelivery;
        this.ossDelivery = builder.ossDelivery;
        this.s3Delivery = builder.s3Delivery;
        this.slsDelivery = builder.slsDelivery;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserDeliveryTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return details
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * @return discardRate
     */
    public Float getDiscardRate() {
        return this.discardRate;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return filterVer
     */
    public String getFilterVer() {
        return this.filterVer;
    }

    /**
     * @return httpDelivery
     */
    public HttpDelivery getHttpDelivery() {
        return this.httpDelivery;
    }

    /**
     * @return kafkaDelivery
     */
    public KafkaDelivery getKafkaDelivery() {
        return this.kafkaDelivery;
    }

    /**
     * @return ossDelivery
     */
    public OssDelivery getOssDelivery() {
        return this.ossDelivery;
    }

    /**
     * @return s3Delivery
     */
    public S3Delivery getS3Delivery() {
        return this.s3Delivery;
    }

    /**
     * @return slsDelivery
     */
    public SlsDelivery getSlsDelivery() {
        return this.slsDelivery;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateUserDeliveryTaskRequest, Builder> {
        private String businessType; 
        private String dataCenter; 
        private String deliveryType; 
        private String details; 
        private Float discardRate; 
        private String fieldName; 
        private String filterVer; 
        private HttpDelivery httpDelivery; 
        private KafkaDelivery kafkaDelivery; 
        private OssDelivery ossDelivery; 
        private S3Delivery s3Delivery; 
        private SlsDelivery slsDelivery; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserDeliveryTaskRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.dataCenter = request.dataCenter;
            this.deliveryType = request.deliveryType;
            this.details = request.details;
            this.discardRate = request.discardRate;
            this.fieldName = request.fieldName;
            this.filterVer = request.filterVer;
            this.httpDelivery = request.httpDelivery;
            this.kafkaDelivery = request.kafkaDelivery;
            this.ossDelivery = request.ossDelivery;
            this.s3Delivery = request.s3Delivery;
            this.slsDelivery = request.slsDelivery;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The real-time log type. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_er_pod</strong>: edge container logs.</li>
         * <li><strong>dcdn_log_dns</strong>: edge DNS logs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_er_pod</p>
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: the Chinese mainland.</li>
         * <li><strong>sg</strong>: global (excluding the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putBodyParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The delivery type. Valid values:</p>
         * <ul>
         * <li><strong>sls</strong>: Alibaba Cloud Simple Log Service.</li>
         * <li><strong>http</strong>: HTTP service.</li>
         * <li><strong>aws3</strong>: Amazon S3 service.</li>
         * <li><strong>oss</strong>: Alibaba Cloud Object Storage Service.</li>
         * <li><strong>kafka</strong>: Kafka service.</li>
         * <li><strong>aws3cmpt</strong>: Amazon S3-compatible service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        public Builder deliveryType(String deliveryType) {
            this.putBodyParameter("DeliveryType", deliveryType);
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>The list of Edge Routine (ER) pods to configure.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx,xxx</p>
         */
        public Builder details(String details) {
            this.putBodyParameter("Details", details);
            this.details = details;
            return this;
        }

        /**
         * <p>The discard rate. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder discardRate(Float discardRate) {
            this.putBodyParameter("DiscardRate", discardRate);
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>The fields to deliver, separated by commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientIP,ClientRequestURI,EdgeResponseStatusCode</p>
         */
        public Builder fieldName(String fieldName) {
            this.putBodyParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The version of the filter rule.</p>
         * <blockquote>
         * <p>This parameter is used for backward compatibility with legacy filter rules. The default value is v1. New tasks use v2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder filterVer(String filterVer) {
            this.putBodyParameter("FilterVer", filterVer);
            this.filterVer = filterVer;
            return this;
        }

        /**
         * <p>The HTTP delivery configuration parameters.</p>
         */
        public Builder httpDelivery(HttpDelivery httpDelivery) {
            String httpDeliveryShrink = shrink(httpDelivery, "HttpDelivery", "json");
            this.putBodyParameter("HttpDelivery", httpDeliveryShrink);
            this.httpDelivery = httpDelivery;
            return this;
        }

        /**
         * <p>The Kafka delivery configuration parameters.</p>
         */
        public Builder kafkaDelivery(KafkaDelivery kafkaDelivery) {
            String kafkaDeliveryShrink = shrink(kafkaDelivery, "KafkaDelivery", "json");
            this.putBodyParameter("KafkaDelivery", kafkaDeliveryShrink);
            this.kafkaDelivery = kafkaDelivery;
            return this;
        }

        /**
         * <p>The OSS delivery configuration parameters.</p>
         */
        public Builder ossDelivery(OssDelivery ossDelivery) {
            String ossDeliveryShrink = shrink(ossDelivery, "OssDelivery", "json");
            this.putBodyParameter("OssDelivery", ossDeliveryShrink);
            this.ossDelivery = ossDelivery;
            return this;
        }

        /**
         * <p>The S3 or S3-compatible delivery configuration parameters.</p>
         */
        public Builder s3Delivery(S3Delivery s3Delivery) {
            String s3DeliveryShrink = shrink(s3Delivery, "S3Delivery", "json");
            this.putBodyParameter("S3Delivery", s3DeliveryShrink);
            this.s3Delivery = s3Delivery;
            return this;
        }

        /**
         * <p>The SLS delivery configuration.</p>
         */
        public Builder slsDelivery(SlsDelivery slsDelivery) {
            String slsDeliveryShrink = shrink(slsDelivery, "SlsDelivery", "json");
            this.putBodyParameter("SlsDelivery", slsDeliveryShrink);
            this.slsDelivery = slsDelivery;
            return this;
        }

        /**
         * <p>The task name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateUserDeliveryTaskRequest build() {
            return new CreateUserDeliveryTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateUserDeliveryTaskRequest</p>
     */
    public static class StandardAuthParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Integer expiredTime;

        @com.aliyun.core.annotation.NameInMap("PrivateKey")
        private String privateKey;

        @com.aliyun.core.annotation.NameInMap("UrlPath")
        private String urlPath;

        private StandardAuthParam(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.privateKey = builder.privateKey;
            this.urlPath = builder.urlPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardAuthParam create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public Integer getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        /**
         * @return urlPath
         */
        public String getUrlPath() {
            return this.urlPath;
        }

        public static final class Builder {
            private Integer expiredTime; 
            private String privateKey; 
            private String urlPath; 

            private Builder() {
            } 

            private Builder(StandardAuthParam model) {
                this.expiredTime = model.expiredTime;
                this.privateKey = model.privateKey;
                this.urlPath = model.urlPath;
            } 

            /**
             * <p>The encryption timeout period.</p>
             * <blockquote>
             * <p>The value must be greater than 0. A value of 300 or greater is recommended. Unit: seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder expiredTime(Integer expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The private key.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * <p>The URL path.</p>
             * 
             * <strong>example:</strong>
             * <p>v1/log/upload</p>
             */
            public Builder urlPath(String urlPath) {
                this.urlPath = urlPath;
                return this;
            }

            public StandardAuthParam build() {
                return new StandardAuthParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateUserDeliveryTaskRequest</p>
     */
    public static class HttpDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compress")
        private String compress;

        @com.aliyun.core.annotation.NameInMap("DestUrl")
        private String destUrl;

        @com.aliyun.core.annotation.NameInMap("HeaderParam")
        private java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam;

        @com.aliyun.core.annotation.NameInMap("LastLogSplit")
        private Boolean lastLogSplit;

        @com.aliyun.core.annotation.NameInMap("LogBodyPrefix")
        private String logBodyPrefix;

        @com.aliyun.core.annotation.NameInMap("LogBodySuffix")
        private String logBodySuffix;

        @com.aliyun.core.annotation.NameInMap("LogSplit")
        private Boolean logSplit;

        @com.aliyun.core.annotation.NameInMap("LogSplitWords")
        private String logSplitWords;

        @com.aliyun.core.annotation.NameInMap("MaxBatchMB")
        private Long maxBatchMB;

        @com.aliyun.core.annotation.NameInMap("MaxBatchSize")
        private Long maxBatchSize;

        @com.aliyun.core.annotation.NameInMap("MaxRetry")
        private Long maxRetry;

        @com.aliyun.core.annotation.NameInMap("QueryParam")
        private java.util.Map<String, HttpDeliveryQueryParamValue> queryParam;

        @com.aliyun.core.annotation.NameInMap("StandardAuthOn")
        private Boolean standardAuthOn;

        @com.aliyun.core.annotation.NameInMap("StandardAuthParam")
        private StandardAuthParam standardAuthParam;

        @com.aliyun.core.annotation.NameInMap("TransformTimeout")
        private Long transformTimeout;

        private HttpDelivery(Builder builder) {
            this.compress = builder.compress;
            this.destUrl = builder.destUrl;
            this.headerParam = builder.headerParam;
            this.lastLogSplit = builder.lastLogSplit;
            this.logBodyPrefix = builder.logBodyPrefix;
            this.logBodySuffix = builder.logBodySuffix;
            this.logSplit = builder.logSplit;
            this.logSplitWords = builder.logSplitWords;
            this.maxBatchMB = builder.maxBatchMB;
            this.maxBatchSize = builder.maxBatchSize;
            this.maxRetry = builder.maxRetry;
            this.queryParam = builder.queryParam;
            this.standardAuthOn = builder.standardAuthOn;
            this.standardAuthParam = builder.standardAuthParam;
            this.transformTimeout = builder.transformTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpDelivery create() {
            return builder().build();
        }

        /**
         * @return compress
         */
        public String getCompress() {
            return this.compress;
        }

        /**
         * @return destUrl
         */
        public String getDestUrl() {
            return this.destUrl;
        }

        /**
         * @return headerParam
         */
        public java.util.Map<String, HttpDeliveryHeaderParamValue> getHeaderParam() {
            return this.headerParam;
        }

        /**
         * @return lastLogSplit
         */
        public Boolean getLastLogSplit() {
            return this.lastLogSplit;
        }

        /**
         * @return logBodyPrefix
         */
        public String getLogBodyPrefix() {
            return this.logBodyPrefix;
        }

        /**
         * @return logBodySuffix
         */
        public String getLogBodySuffix() {
            return this.logBodySuffix;
        }

        /**
         * @return logSplit
         */
        public Boolean getLogSplit() {
            return this.logSplit;
        }

        /**
         * @return logSplitWords
         */
        public String getLogSplitWords() {
            return this.logSplitWords;
        }

        /**
         * @return maxBatchMB
         */
        public Long getMaxBatchMB() {
            return this.maxBatchMB;
        }

        /**
         * @return maxBatchSize
         */
        public Long getMaxBatchSize() {
            return this.maxBatchSize;
        }

        /**
         * @return maxRetry
         */
        public Long getMaxRetry() {
            return this.maxRetry;
        }

        /**
         * @return queryParam
         */
        public java.util.Map<String, HttpDeliveryQueryParamValue> getQueryParam() {
            return this.queryParam;
        }

        /**
         * @return standardAuthOn
         */
        public Boolean getStandardAuthOn() {
            return this.standardAuthOn;
        }

        /**
         * @return standardAuthParam
         */
        public StandardAuthParam getStandardAuthParam() {
            return this.standardAuthParam;
        }

        /**
         * @return transformTimeout
         */
        public Long getTransformTimeout() {
            return this.transformTimeout;
        }

        public static final class Builder {
            private String compress; 
            private String destUrl; 
            private java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam; 
            private Boolean lastLogSplit; 
            private String logBodyPrefix; 
            private String logBodySuffix; 
            private Boolean logSplit; 
            private String logSplitWords; 
            private Long maxBatchMB; 
            private Long maxBatchSize; 
            private Long maxRetry; 
            private java.util.Map<String, HttpDeliveryQueryParamValue> queryParam; 
            private Boolean standardAuthOn; 
            private StandardAuthParam standardAuthParam; 
            private Long transformTimeout; 

            private Builder() {
            } 

            private Builder(HttpDelivery model) {
                this.compress = model.compress;
                this.destUrl = model.destUrl;
                this.headerParam = model.headerParam;
                this.lastLogSplit = model.lastLogSplit;
                this.logBodyPrefix = model.logBodyPrefix;
                this.logBodySuffix = model.logBodySuffix;
                this.logSplit = model.logSplit;
                this.logSplitWords = model.logSplitWords;
                this.maxBatchMB = model.maxBatchMB;
                this.maxBatchSize = model.maxBatchSize;
                this.maxRetry = model.maxRetry;
                this.queryParam = model.queryParam;
                this.standardAuthOn = model.standardAuthOn;
                this.standardAuthParam = model.standardAuthParam;
                this.transformTimeout = model.transformTimeout;
            } 

            /**
             * <p>The compression method.</p>
             * 
             * <strong>example:</strong>
             * <p>gzip</p>
             */
            public Builder compress(String compress) {
                this.compress = compress;
                return this;
            }

            /**
             * <p>The HTTP server delivery address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.aliyun.com/v1/log/upload">http://xxx.aliyun.com/v1/log/upload</a></p>
             */
            public Builder destUrl(String destUrl) {
                this.destUrl = destUrl;
                return this;
            }

            /**
             * <p>The Custom Header.</p>
             */
            public Builder headerParam(java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam) {
                this.headerParam = headerParam;
                return this;
            }

            /**
             * <p>The trailing separator.</p>
             * 
             * <strong>example:</strong>
             * <p>\n</p>
             */
            public Builder lastLogSplit(Boolean lastLogSplit) {
                this.lastLogSplit = lastLogSplit;
                return this;
            }

            /**
             * <p>The prefix of the log delivery package.</p>
             * 
             * <strong>example:</strong>
             * <p>cdnVersion:1.0</p>
             */
            public Builder logBodyPrefix(String logBodyPrefix) {
                this.logBodyPrefix = logBodyPrefix;
                return this;
            }

            /**
             * <p>The suffix of the log delivery package.</p>
             * 
             * <strong>example:</strong>
             * <p>cdnVersion:1.0</p>
             */
            public Builder logBodySuffix(String logBodySuffix) {
                this.logBodySuffix = logBodySuffix;
                return this;
            }

            /**
             * <p>Specifies whether to enable log segmentation. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logSplit(Boolean logSplit) {
                this.logSplit = logSplit;
                return this;
            }

            /**
             * <p>The log separator.</p>
             * 
             * <strong>example:</strong>
             * <p>\n</p>
             */
            public Builder logSplitWords(String logSplitWords) {
                this.logSplitWords = logSplitWords;
                return this;
            }

            /**
             * <p>The maximum size of a single delivery batch. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxBatchMB(Long maxBatchMB) {
                this.maxBatchMB = maxBatchMB;
                return this;
            }

            /**
             * <p>The maximum number of log entries per delivery batch.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxBatchSize(Long maxBatchSize) {
                this.maxBatchSize = maxBatchSize;
                return this;
            }

            /**
             * <p>The maximum number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxRetry(Long maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * <p>The custom request parameters.</p>
             */
            public Builder queryParam(java.util.Map<String, HttpDeliveryQueryParamValue> queryParam) {
                this.queryParam = queryParam;
                return this;
            }

            /**
             * <p>Specifies whether to use standard authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder standardAuthOn(Boolean standardAuthOn) {
                this.standardAuthOn = standardAuthOn;
                return this;
            }

            /**
             * <p>The standard authentication parameters.</p>
             */
            public Builder standardAuthParam(StandardAuthParam standardAuthParam) {
                this.standardAuthParam = standardAuthParam;
                return this;
            }

            /**
             * <p>The timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder transformTimeout(Long transformTimeout) {
                this.transformTimeout = transformTimeout;
                return this;
            }

            public HttpDelivery build() {
                return new HttpDelivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateUserDeliveryTaskRequest</p>
     */
    public static class KafkaDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Balancer")
        private String balancer;

        @com.aliyun.core.annotation.NameInMap("Brokers")
        private java.util.List<String> brokers;

        @com.aliyun.core.annotation.NameInMap("Compress")
        private String compress;

        @com.aliyun.core.annotation.NameInMap("MachanismType")
        private String machanismType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("UseTLS")
        private Boolean useTLS;

        @com.aliyun.core.annotation.NameInMap("UserAuth")
        private Boolean userAuth;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private KafkaDelivery(Builder builder) {
            this.balancer = builder.balancer;
            this.brokers = builder.brokers;
            this.compress = builder.compress;
            this.machanismType = builder.machanismType;
            this.password = builder.password;
            this.topic = builder.topic;
            this.useTLS = builder.useTLS;
            this.userAuth = builder.userAuth;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaDelivery create() {
            return builder().build();
        }

        /**
         * @return balancer
         */
        public String getBalancer() {
            return this.balancer;
        }

        /**
         * @return brokers
         */
        public java.util.List<String> getBrokers() {
            return this.brokers;
        }

        /**
         * @return compress
         */
        public String getCompress() {
            return this.compress;
        }

        /**
         * @return machanismType
         */
        public String getMachanismType() {
            return this.machanismType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return useTLS
         */
        public Boolean getUseTLS() {
            return this.useTLS;
        }

        /**
         * @return userAuth
         */
        public Boolean getUserAuth() {
            return this.userAuth;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String balancer; 
            private java.util.List<String> brokers; 
            private String compress; 
            private String machanismType; 
            private String password; 
            private String topic; 
            private Boolean useTLS; 
            private Boolean userAuth; 
            private String userName; 

            private Builder() {
            } 

            private Builder(KafkaDelivery model) {
                this.balancer = model.balancer;
                this.brokers = model.brokers;
                this.compress = model.compress;
                this.machanismType = model.machanismType;
                this.password = model.password;
                this.topic = model.topic;
                this.useTLS = model.useTLS;
                this.userAuth = model.userAuth;
                this.userName = model.userName;
            } 

            /**
             * <p>The load balancing method.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka.LeastBytes</p>
             */
            public Builder balancer(String balancer) {
                this.balancer = balancer;
                return this;
            }

            /**
             * <p>The server array.</p>
             */
            public Builder brokers(java.util.List<String> brokers) {
                this.brokers = brokers;
                return this;
            }

            /**
             * <p>The compression method. By default, no compression is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>lz4</p>
             */
            public Builder compress(String compress) {
                this.compress = compress;
                return this;
            }

            /**
             * <p>The encryption method.</p>
             * 
             * <strong>example:</strong>
             * <p>plain</p>
             */
            public Builder machanismType(String machanismType) {
                this.machanismType = machanismType;
                return this;
            }

            /**
             * <p>The encryption password.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The Kafka message topic.</p>
             * 
             * <strong>example:</strong>
             * <p>dqc_test2</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>Specifies whether to enable SASL-encrypted transmission for Kafka delivery.</p>
             * <blockquote>
             * <p>The delivery address must be configured with a public certificate. Verification with a self-signed certificate will fail.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useTLS(Boolean useTLS) {
                this.useTLS = useTLS;
                return this;
            }

            /**
             * <p>Specifies whether to enable user authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder userAuth(Boolean userAuth) {
                this.userAuth = userAuth;
                return this;
            }

            /**
             * <p>The encryption username.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public KafkaDelivery build() {
                return new KafkaDelivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateUserDeliveryTaskRequest</p>
     */
    public static class OssDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("PrefixPath")
        private String prefixPath;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private OssDelivery(Builder builder) {
            this.aliuid = builder.aliuid;
            this.bucketName = builder.bucketName;
            this.prefixPath = builder.prefixPath;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssDelivery create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return prefixPath
         */
        public String getPrefixPath() {
            return this.prefixPath;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String aliuid; 
            private String bucketName; 
            private String prefixPath; 
            private String region; 

            private Builder() {
            } 

            private Builder(OssDelivery model) {
                this.aliuid = model.aliuid;
                this.bucketName = model.bucketName;
                this.prefixPath = model.prefixPath;
                this.region = model.region;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234***</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_rlog</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The OSS storage path prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>test/</p>
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * <p>The OSS region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public OssDelivery build() {
                return new OssDelivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateUserDeliveryTaskRequest</p>
     */
    public static class S3Delivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("BucketPath")
        private String bucketPath;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("PrefixPath")
        private String prefixPath;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("S3Cmpt")
        private Boolean s3Cmpt;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("ServerSideEncryption")
        private Boolean serverSideEncryption;

        @com.aliyun.core.annotation.NameInMap("VertifyType")
        private String vertifyType;

        private S3Delivery(Builder builder) {
            this.accessKey = builder.accessKey;
            this.bucketPath = builder.bucketPath;
            this.endpoint = builder.endpoint;
            this.prefixPath = builder.prefixPath;
            this.region = builder.region;
            this.s3Cmpt = builder.s3Cmpt;
            this.secretKey = builder.secretKey;
            this.serverSideEncryption = builder.serverSideEncryption;
            this.vertifyType = builder.vertifyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static S3Delivery create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return prefixPath
         */
        public String getPrefixPath() {
            return this.prefixPath;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return s3Cmpt
         */
        public Boolean getS3Cmpt() {
            return this.s3Cmpt;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return serverSideEncryption
         */
        public Boolean getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        /**
         * @return vertifyType
         */
        public String getVertifyType() {
            return this.vertifyType;
        }

        public static final class Builder {
            private String accessKey; 
            private String bucketPath; 
            private String endpoint; 
            private String prefixPath; 
            private String region; 
            private Boolean s3Cmpt; 
            private String secretKey; 
            private Boolean serverSideEncryption; 
            private String vertifyType; 

            private Builder() {
            } 

            private Builder(S3Delivery model) {
                this.accessKey = model.accessKey;
                this.bucketPath = model.bucketPath;
                this.endpoint = model.endpoint;
                this.prefixPath = model.prefixPath;
                this.region = model.region;
                this.s3Cmpt = model.s3Cmpt;
                this.secretKey = model.secretKey;
                this.serverSideEncryption = model.serverSideEncryption;
                this.vertifyType = model.vertifyType;
            } 

            /**
             * <p>The AccessKey ID of the S3 account.</p>
             * 
             * <strong>example:</strong>
             * <p>g0f46623ll0g0</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The bucket storage path.</p>
             * 
             * <strong>example:</strong>
             * <p>logriver-test/log</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The S3 endpoint address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://s3.oss-cn-hangzhou.aliyuncs.com">https://s3.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The storage path prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>logriver-test/log</p>
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * <p>The region where the service resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Specifies whether the storage is S3-compatible.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder s3Cmpt(Boolean s3Cmpt) {
                this.s3Cmpt = s3Cmpt;
                return this;
            }

            /**
             * <p>The SecretKey of the S3 account.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>Specifies whether to enable S3 server-side encryption.</p>
             * <p>To configure server-side encryption for the S3 bucket, refer to OSS <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder serverSideEncryption(Boolean serverSideEncryption) {
                this.serverSideEncryption = serverSideEncryption;
                return this;
            }

            /**
             * <p>The key verification method for S3 delivery.</p>
             * <blockquote>
             * <p>The key configuration comes from the console or SDK. Keys from the console are encrypted during transmission. Keys from the SDK do not require encryption.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder vertifyType(String vertifyType) {
                this.vertifyType = vertifyType;
                return this;
            }

            public S3Delivery build() {
                return new S3Delivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateUserDeliveryTaskRequest</p>
     */
    public static class SlsDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SLSLogStore")
        private String SLSLogStore;

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        private String SLSProject;

        @com.aliyun.core.annotation.NameInMap("SLSRegion")
        private String SLSRegion;

        private SlsDelivery(Builder builder) {
            this.SLSLogStore = builder.SLSLogStore;
            this.SLSProject = builder.SLSProject;
            this.SLSRegion = builder.SLSRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsDelivery create() {
            return builder().build();
        }

        /**
         * @return SLSLogStore
         */
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        /**
         * @return SLSProject
         */
        public String getSLSProject() {
            return this.SLSProject;
        }

        /**
         * @return SLSRegion
         */
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public static final class Builder {
            private String SLSLogStore; 
            private String SLSProject; 
            private String SLSRegion; 

            private Builder() {
            } 

            private Builder(SlsDelivery model) {
                this.SLSLogStore = model.SLSLogStore;
                this.SLSProject = model.SLSProject;
                this.SLSRegion = model.SLSRegion;
            } 

            /**
             * <p>The Simple Log Service (SLS) Logstore name.</p>
             * 
             * <strong>example:</strong>
             * <p>accesslog-test</p>
             */
            public Builder SLSLogStore(String SLSLogStore) {
                this.SLSLogStore = SLSLogStore;
                return this;
            }

            /**
             * <p>The Simple Log Service (SLS) project name.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdn-test20240417</p>
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * <p>The region where Simple Log Service (SLS) resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder SLSRegion(String SLSRegion) {
                this.SLSRegion = SLSRegion;
                return this;
            }

            public SlsDelivery build() {
                return new SlsDelivery(this);
            } 

        } 

    }
}
