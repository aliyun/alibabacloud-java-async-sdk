// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomLineRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomLineRequest</p>
 */
public class UpdateCustomLineRequest extends Request {
    @Query
    @NameInMap("IpSegment")
    private java.util.List < IpSegment> ipSegment;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LineId")
    @Validation(required = true)
    private Long lineId;

    @Query
    @NameInMap("LineName")
    private String lineName;

    private UpdateCustomLineRequest(Builder builder) {
        super(builder);
        this.ipSegment = builder.ipSegment;
        this.lang = builder.lang;
        this.lineId = builder.lineId;
        this.lineName = builder.lineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipSegment
     */
    public java.util.List < IpSegment> getIpSegment() {
        return this.ipSegment;
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

    /**
     * @return lineName
     */
    public String getLineName() {
        return this.lineName;
    }

    public static final class Builder extends Request.Builder<UpdateCustomLineRequest, Builder> {
        private java.util.List < IpSegment> ipSegment; 
        private String lang; 
        private Long lineId; 
        private String lineName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomLineRequest request) {
            super(request);
            this.ipSegment = request.ipSegment;
            this.lang = request.lang;
            this.lineId = request.lineId;
            this.lineName = request.lineName;
        } 

        /**
         * IpSegment.
         */
        public Builder ipSegment(java.util.List < IpSegment> ipSegment) {
            this.putQueryParameter("IpSegment", ipSegment);
            this.ipSegment = ipSegment;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LineId.
         */
        public Builder lineId(Long lineId) {
            this.putQueryParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        /**
         * LineName.
         */
        public Builder lineName(String lineName) {
            this.putQueryParameter("LineName", lineName);
            this.lineName = lineName;
            return this;
        }

        @Override
        public UpdateCustomLineRequest build() {
            return new UpdateCustomLineRequest(this);
        } 

    } 

    public static class IpSegment extends TeaModel {
        @NameInMap("EndIp")
        private String endIp;

        @NameInMap("StartIp")
        private String startIp;

        private IpSegment(Builder builder) {
            this.endIp = builder.endIp;
            this.startIp = builder.startIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSegment create() {
            return builder().build();
        }

        /**
         * @return endIp
         */
        public String getEndIp() {
            return this.endIp;
        }

        /**
         * @return startIp
         */
        public String getStartIp() {
            return this.startIp;
        }

        public static final class Builder {
            private String endIp; 
            private String startIp; 

            /**
             * EndIp.
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * StartIp.
             */
            public Builder startIp(String startIp) {
                this.startIp = startIp;
                return this;
            }

            public IpSegment build() {
                return new IpSegment(this);
            } 

        } 

    }
}
