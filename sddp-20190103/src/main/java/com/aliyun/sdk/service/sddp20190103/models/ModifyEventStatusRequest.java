// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyEventStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventStatusRequest</p>
 */
public class ModifyEventStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Backed")
    private Boolean backed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DealReason")
    private String dealReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private ModifyEventStatusRequest(Builder builder) {
        super(builder);
        this.backed = builder.backed;
        this.dealReason = builder.dealReason;
        this.id = builder.id;
        this.lang = builder.lang;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backed
     */
    public Boolean getBacked() {
        return this.backed;
    }

    /**
     * @return dealReason
     */
    public String getDealReason() {
        return this.dealReason;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyEventStatusRequest, Builder> {
        private Boolean backed; 
        private String dealReason; 
        private Long id; 
        private String lang; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventStatusRequest request) {
            super(request);
            this.backed = request.backed;
            this.dealReason = request.dealReason;
            this.id = request.id;
            this.lang = request.lang;
            this.status = request.status;
        } 

        /**
         * <p>Specifies whether to enhance the detection of anomalous events. If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder backed(Boolean backed) {
            this.putQueryParameter("Backed", backed);
            this.backed = backed;
            return this;
        }

        /**
         * <p>The reason why the anomalous event is handled.</p>
         * 
         * <strong>example:</strong>
         * <p>Anomaly confirmed</p>
         */
        public Builder dealReason(String dealReason) {
            this.putQueryParameter("DealReason", dealReason);
            this.dealReason = dealReason;
            return this;
        }

        /**
         * <p>The ID of the anomalous event.</p>
         * <blockquote>
         * <p>You can call the <strong>DescribeEvents</strong> operation to query the ID of the anomalous event.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The method to handle the anomalous event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: marks the anomalous event as a false positive.</li>
         * <li><strong>2</strong>: confirms and handles the anomalous event.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyEventStatusRequest build() {
            return new ModifyEventStatusRequest(this);
        } 

    } 

}
