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
 * {@link CreateSiteDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSiteDeliveryTaskRequest</p>
 */
public class CreateSiteDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataCenter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscardRate")
    private Float discardRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

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
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsDelivery")
    private SlsDelivery slsDelivery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateSiteDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.deliveryType = builder.deliveryType;
        this.discardRate = builder.discardRate;
        this.fieldName = builder.fieldName;
        this.httpDelivery = builder.httpDelivery;
        this.kafkaDelivery = builder.kafkaDelivery;
        this.ossDelivery = builder.ossDelivery;
        this.s3Delivery = builder.s3Delivery;
        this.siteId = builder.siteId;
        this.slsDelivery = builder.slsDelivery;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteDeliveryTaskRequest create() {
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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

    public static final class Builder extends Request.Builder<CreateSiteDeliveryTaskRequest, Builder> {
        private String businessType; 
        private String dataCenter; 
        private String deliveryType; 
        private Float discardRate; 
        private String fieldName; 
        private HttpDelivery httpDelivery; 
        private KafkaDelivery kafkaDelivery; 
        private OssDelivery ossDelivery; 
        private S3Delivery s3Delivery; 
        private Long siteId; 
        private SlsDelivery slsDelivery; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSiteDeliveryTaskRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.dataCenter = request.dataCenter;
            this.deliveryType = request.deliveryType;
            this.discardRate = request.discardRate;
            this.fieldName = request.fieldName;
            this.httpDelivery = request.httpDelivery;
            this.kafkaDelivery = request.kafkaDelivery;
            this.ossDelivery = request.ossDelivery;
            this.s3Delivery = request.s3Delivery;
            this.siteId = request.siteId;
            this.slsDelivery = request.slsDelivery;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The log category. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1</strong> (default): access logs.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
         * <li><strong>dcdn_log_waf</strong>: firewall logs.</li>
         * <li><strong>dcdn_log_ipa</strong>: TCP/UDP proxy logs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li>cn: the Chinese mainland.</li>
         * <li>oversea: outside the Chinese mainland.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The destination of the delivery. Valid values:</p>
         * <ul>
         * <li>sls: Alibaba Cloud Simple Log Service (SLS).</li>
         * <li>http: HTTP server.</li>
         * <li>aws3: Amazon Simple Storage Service (S3).</li>
         * <li>oss: Alibaba Cloud Object Storage Service (OSS).</li>
         * <li>kafka: Kafka.</li>
         * <li>aws3cmpt: S3-compatible storage service.</li>
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
         * <p>The discard rate. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder discardRate(Float discardRate) {
            this.putBodyParameter("DiscardRate", discardRate);
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>The log fields, which are separated by commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_agent,ip_adress,ip_port</p>
         */
        public Builder fieldName(String fieldName) {
            this.putBodyParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The configurations for delivery to an HTTP server.</p>
         */
        public Builder httpDelivery(HttpDelivery httpDelivery) {
            String httpDeliveryShrink = shrink(httpDelivery, "HttpDelivery", "json");
            this.putBodyParameter("HttpDelivery", httpDeliveryShrink);
            this.httpDelivery = httpDelivery;
            return this;
        }

        /**
         * <p>The configurations for delivery to Kafka.</p>
         */
        public Builder kafkaDelivery(KafkaDelivery kafkaDelivery) {
            String kafkaDeliveryShrink = shrink(kafkaDelivery, "KafkaDelivery", "json");
            this.putBodyParameter("KafkaDelivery", kafkaDeliveryShrink);
            this.kafkaDelivery = kafkaDelivery;
            return this;
        }

        /**
         * <p>The configurations for delivery to OSS.</p>
         */
        public Builder ossDelivery(OssDelivery ossDelivery) {
            String ossDeliveryShrink = shrink(ossDelivery, "OssDelivery", "json");
            this.putBodyParameter("OssDelivery", ossDeliveryShrink);
            this.ossDelivery = ossDelivery;
            return this;
        }

        /**
         * <p>The configurations for delivery to Amazon S3 or an S3-compatible service.</p>
         */
        public Builder s3Delivery(S3Delivery s3Delivery) {
            String s3DeliveryShrink = shrink(s3Delivery, "S3Delivery", "json");
            this.putBodyParameter("S3Delivery", s3DeliveryShrink);
            this.s3Delivery = s3Delivery;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12312312112***</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The configurations for delivery to SLS.</p>
         */
        public Builder slsDelivery(SlsDelivery slsDelivery) {
            String slsDeliveryShrink = shrink(slsDelivery, "SlsDelivery", "json");
            this.putBodyParameter("SlsDelivery", slsDeliveryShrink);
            this.slsDelivery = slsDelivery;
            return this;
        }

        /**
         * <p>The name of the delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn-test-task</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateSiteDeliveryTaskRequest build() {
            return new CreateSiteDeliveryTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSiteDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteDeliveryTaskRequest</p>
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
             * <p>The validity period of the signature.</p>
             * <blockquote>
             * <p> The value must be greater than 0. We recommend that you specify a value that is greater than 300.</p>
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
             * <hr>
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * <p>The URI path for server authentication.</p>
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
     * {@link CreateSiteDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteDeliveryTaskRequest</p>
     */
    public static class HttpDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compress")
        private String compress;

        @com.aliyun.core.annotation.NameInMap("DestUrl")
        private String destUrl;

        @com.aliyun.core.annotation.NameInMap("HeaderParam")
        private java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam;

        @com.aliyun.core.annotation.NameInMap("LogBodyPrefix")
        private String logBodyPrefix;

        @com.aliyun.core.annotation.NameInMap("LogBodySuffix")
        private String logBodySuffix;

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
            this.logBodyPrefix = builder.logBodyPrefix;
            this.logBodySuffix = builder.logBodySuffix;
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
            private String logBodyPrefix; 
            private String logBodySuffix; 
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
                this.logBodyPrefix = model.logBodyPrefix;
                this.logBodySuffix = model.logBodySuffix;
                this.maxBatchMB = model.maxBatchMB;
                this.maxBatchSize = model.maxBatchSize;
                this.maxRetry = model.maxRetry;
                this.queryParam = model.queryParam;
                this.standardAuthOn = model.standardAuthOn;
                this.standardAuthParam = model.standardAuthParam;
                this.transformTimeout = model.transformTimeout;
            } 

            /**
             * <p>The compression method. By default, data is not compressed.</p>
             * 
             * <strong>example:</strong>
             * <p>gzip</p>
             */
            public Builder compress(String compress) {
                this.compress = compress;
                return this;
            }

            /**
             * <p>The address of the HTTP server.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.aliyun.com/v1/log/upload">http://xxx.aliyun.com/v1/log/upload</a></p>
             */
            public Builder destUrl(String destUrl) {
                this.destUrl = destUrl;
                return this;
            }

            /**
             * <p>The custom headers.</p>
             */
            public Builder headerParam(java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam) {
                this.headerParam = headerParam;
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
             * <p>The maximum size of data for each delivery. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxBatchMB(Long maxBatchMB) {
                this.maxBatchMB = maxBatchMB;
                return this;
            }

            /**
             * <p>The maximum number of entries for each delivery.</p>
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
             * <p>The custom query parameters.</p>
             */
            public Builder queryParam(java.util.Map<String, HttpDeliveryQueryParamValue> queryParam) {
                this.queryParam = queryParam;
                return this;
            }

            /**
             * <p>Specifies whether to use server authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder standardAuthOn(Boolean standardAuthOn) {
                this.standardAuthOn = standardAuthOn;
                return this;
            }

            /**
             * <p>The authentication configurations.</p>
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
     * {@link CreateSiteDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteDeliveryTaskRequest</p>
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
             * <p>The brokers.</p>
             */
            public Builder brokers(java.util.List<String> brokers) {
                this.brokers = brokers;
                return this;
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
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The topic.</p>
             * 
             * <strong>example:</strong>
             * <p>dqc_test2</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>Specifies whether to enable authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder userAuth(Boolean userAuth) {
                this.userAuth = userAuth;
                return this;
            }

            /**
             * <p>The username.</p>
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
     * {@link CreateSiteDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteDeliveryTaskRequest</p>
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
             * <p>The ID of your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1234***</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test_rlog</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The prefix of the path in which you want to store logs.</p>
             * 
             * <strong>example:</strong>
             * <p>logriver-test/log</p>
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * <p>The region in which the bucket is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
     * {@link CreateSiteDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteDeliveryTaskRequest</p>
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
             * <p>The access key ID of your Amazon S3 account.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAccessKeyID</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The directory in the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>logriver-test/log</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The endpoint. This parameter is required when the S3Cmpt parameter is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://s3.oss-cn-hangzhou.aliyuncs.com">https://s3.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The prefix of the path in which you want to store logs.</p>
             * 
             * <strong>example:</strong>
             * <p>logriver-test/log</p>
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * <p>The region ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Specifies whether the service is compatible with Amazon S3.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder s3Cmpt(Boolean s3Cmpt) {
                this.s3Cmpt = s3Cmpt;
                return this;
            }

            /**
             * <p>The secret access key of your Amazon S3 account.</p>
             * 
             * <strong>example:</strong>
             * <p>LDSIKh***</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * ServerSideEncryption.
             */
            public Builder serverSideEncryption(Boolean serverSideEncryption) {
                this.serverSideEncryption = serverSideEncryption;
                return this;
            }

            /**
             * VertifyType.
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
     * {@link CreateSiteDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteDeliveryTaskRequest</p>
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
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>accesslog-test</p>
             */
            public Builder SLSLogStore(String SLSLogStore) {
                this.SLSLogStore = SLSLogStore;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdn-test20240417</p>
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * <p>The region in which the SLS project resides.</p>
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
