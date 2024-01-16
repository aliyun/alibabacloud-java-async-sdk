// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventStatusRequest</p>
 */
public class ModifyEventStatusRequest extends Request {
    @Query
    @NameInMap("Backed")
    private Boolean backed;

    @Query
    @NameInMap("DealReason")
    private String dealReason;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
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
         * Specifies whether to enhance the detection of anomalous events. If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder backed(Boolean backed) {
            this.putQueryParameter("Backed", backed);
            this.backed = backed;
            return this;
        }

        /**
         * The reason why the anomalous event is handled.
         */
        public Builder dealReason(String dealReason) {
            this.putQueryParameter("DealReason", dealReason);
            this.dealReason = dealReason;
            return this;
        }

        /**
         * The ID of the anomalous event.
         * <p>
         * 
         * > You can call the **DescribeEvents** operation to query the ID of the anomalous event.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The method to handle the anomalous event. Valid values:
         * <p>
         * 
         * *   **1**: marks the anomalous event as a false positive.
         * *   **2**: confirms and handles the anomalous event.
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
