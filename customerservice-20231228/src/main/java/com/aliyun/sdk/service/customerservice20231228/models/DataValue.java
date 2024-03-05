// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @NameInMap("docId")
    private Long docId;

    @NameInMap("name")
    private String name;

    @NameInMap("fileName")
    private String fileName;

    @NameInMap("url")
    private String url;

    @NameInMap("uploadTime")
    private String uploadTime;

    @NameInMap("orderId")
    private String orderId;

    @NameInMap("applyId")
    private String applyId;

    private DataValue(Builder builder) {
        this.docId = builder.docId;
        this.name = builder.name;
        this.fileName = builder.fileName;
        this.url = builder.url;
        this.uploadTime = builder.uploadTime;
        this.orderId = builder.orderId;
        this.applyId = builder.applyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    /**
     * @return docId
     */
    public Long getDocId() {
        return this.docId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return uploadTime
     */
    public String getUploadTime() {
        return this.uploadTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return applyId
     */
    public String getApplyId() {
        return this.applyId;
    }

    public static final class Builder {
        private Long docId; 
        private String name; 
        private String fileName; 
        private String url; 
        private String uploadTime; 
        private String orderId; 
        private String applyId; 

        /**
         * docId.
         */
        public Builder docId(Long docId) {
            this.docId = docId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * uploadTime.
         */
        public Builder uploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * applyId.
         */
        public Builder applyId(String applyId) {
            this.applyId = applyId;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
