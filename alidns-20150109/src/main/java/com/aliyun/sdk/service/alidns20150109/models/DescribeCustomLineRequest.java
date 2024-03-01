// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLineRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomLineRequest</p>
 */
public class DescribeCustomLineRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LineId")
    private Long lineId;

    private DescribeCustomLineRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lineId = builder.lineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lineId
     */
    public Long getLineId() {
        return this.lineId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomLineRequest, Builder> {
        private String lang; 
        private Long lineId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomLineRequest request) {
            super(request);
            this.lang = request.lang;
            this.lineId = request.lineId;
        } 

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The unique ID of the custom line.
         */
        public Builder lineId(Long lineId) {
            this.putQueryParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        @Override
        public DescribeCustomLineRequest build() {
            return new DescribeCustomLineRequest(this);
        } 

    } 

}
