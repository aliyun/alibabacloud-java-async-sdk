// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
         * DiscardRate.
         */
        public Builder discardRate(Float discardRate) {
            this.putBodyParameter("DiscardRate", discardRate);
            this.discardRate = discardRate;
            return this;
        }

        /**
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
         * HttpDelivery.
         */
        public Builder httpDelivery(HttpDelivery httpDelivery) {
            String httpDeliveryShrink = shrink(httpDelivery, "HttpDelivery", "json");
            this.putBodyParameter("HttpDelivery", httpDeliveryShrink);
            this.httpDelivery = httpDelivery;
            return this;
        }

        /**
         * KafkaDelivery.
         */
        public Builder kafkaDelivery(KafkaDelivery kafkaDelivery) {
            String kafkaDeliveryShrink = shrink(kafkaDelivery, "KafkaDelivery", "json");
            this.putBodyParameter("KafkaDelivery", kafkaDeliveryShrink);
            this.kafkaDelivery = kafkaDelivery;
            return this;
        }

        /**
         * OssDelivery.
         */
        public Builder ossDelivery(OssDelivery ossDelivery) {
            String ossDeliveryShrink = shrink(ossDelivery, "OssDelivery", "json");
            this.putBodyParameter("OssDelivery", ossDeliveryShrink);
            this.ossDelivery = ossDelivery;
            return this;
        }

        /**
         * S3Delivery.
         */
        public Builder s3Delivery(S3Delivery s3Delivery) {
            String s3DeliveryShrink = shrink(s3Delivery, "S3Delivery", "json");
            this.putBodyParameter("S3Delivery", s3DeliveryShrink);
            this.s3Delivery = s3Delivery;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SlsDelivery.
         */
        public Builder slsDelivery(SlsDelivery slsDelivery) {
            String slsDeliveryShrink = shrink(slsDelivery, "SlsDelivery", "json");
            this.putBodyParameter("SlsDelivery", slsDeliveryShrink);
            this.slsDelivery = slsDelivery;
            return this;
        }

        /**
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

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Integer expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * UrlPath.
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
        private java.util.Map < String, HttpDeliveryHeaderParamValue > headerParam;

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
        private java.util.Map < String, HttpDeliveryQueryParamValue > queryParam;

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
        public java.util.Map < String, HttpDeliveryHeaderParamValue > getHeaderParam() {
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
        public java.util.Map < String, HttpDeliveryQueryParamValue > getQueryParam() {
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
            private java.util.Map < String, HttpDeliveryHeaderParamValue > headerParam; 
            private String logBodyPrefix; 
            private String logBodySuffix; 
            private Long maxBatchMB; 
            private Long maxBatchSize; 
            private Long maxRetry; 
            private java.util.Map < String, HttpDeliveryQueryParamValue > queryParam; 
            private Boolean standardAuthOn; 
            private StandardAuthParam standardAuthParam; 
            private Long transformTimeout; 

            /**
             * Compress.
             */
            public Builder compress(String compress) {
                this.compress = compress;
                return this;
            }

            /**
             * DestUrl.
             */
            public Builder destUrl(String destUrl) {
                this.destUrl = destUrl;
                return this;
            }

            /**
             * HeaderParam.
             */
            public Builder headerParam(java.util.Map < String, HttpDeliveryHeaderParamValue > headerParam) {
                this.headerParam = headerParam;
                return this;
            }

            /**
             * LogBodyPrefix.
             */
            public Builder logBodyPrefix(String logBodyPrefix) {
                this.logBodyPrefix = logBodyPrefix;
                return this;
            }

            /**
             * LogBodySuffix.
             */
            public Builder logBodySuffix(String logBodySuffix) {
                this.logBodySuffix = logBodySuffix;
                return this;
            }

            /**
             * MaxBatchMB.
             */
            public Builder maxBatchMB(Long maxBatchMB) {
                this.maxBatchMB = maxBatchMB;
                return this;
            }

            /**
             * MaxBatchSize.
             */
            public Builder maxBatchSize(Long maxBatchSize) {
                this.maxBatchSize = maxBatchSize;
                return this;
            }

            /**
             * MaxRetry.
             */
            public Builder maxRetry(Long maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * QueryParam.
             */
            public Builder queryParam(java.util.Map < String, HttpDeliveryQueryParamValue > queryParam) {
                this.queryParam = queryParam;
                return this;
            }

            /**
             * StandardAuthOn.
             */
            public Builder standardAuthOn(Boolean standardAuthOn) {
                this.standardAuthOn = standardAuthOn;
                return this;
            }

            /**
             * StandardAuthParam.
             */
            public Builder standardAuthParam(StandardAuthParam standardAuthParam) {
                this.standardAuthParam = standardAuthParam;
                return this;
            }

            /**
             * TransformTimeout.
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
        private java.util.List < String > brokers;

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
        public java.util.List < String > getBrokers() {
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
            private java.util.List < String > brokers; 
            private String compress; 
            private String machanismType; 
            private String password; 
            private String topic; 
            private Boolean userAuth; 
            private String userName; 

            /**
             * Balancer.
             */
            public Builder balancer(String balancer) {
                this.balancer = balancer;
                return this;
            }

            /**
             * Brokers.
             */
            public Builder brokers(java.util.List < String > brokers) {
                this.brokers = brokers;
                return this;
            }

            /**
             * Compress.
             */
            public Builder compress(String compress) {
                this.compress = compress;
                return this;
            }

            /**
             * MachanismType.
             */
            public Builder machanismType(String machanismType) {
                this.machanismType = machanismType;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * UserAuth.
             */
            public Builder userAuth(Boolean userAuth) {
                this.userAuth = userAuth;
                return this;
            }

            /**
             * UserName.
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

            /**
             * Aliuid.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * PrefixPath.
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * Region.
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

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * BucketPath.
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * PrefixPath.
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * S3Cmpt.
             */
            public Builder s3Cmpt(Boolean s3Cmpt) {
                this.s3Cmpt = s3Cmpt;
                return this;
            }

            /**
             * SecretKey.
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

            /**
             * SLSLogStore.
             */
            public Builder SLSLogStore(String SLSLogStore) {
                this.SLSLogStore = SLSLogStore;
                return this;
            }

            /**
             * SLSProject.
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * SLSRegion.
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
