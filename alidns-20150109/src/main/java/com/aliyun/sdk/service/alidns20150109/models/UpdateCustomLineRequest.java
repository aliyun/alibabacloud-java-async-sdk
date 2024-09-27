// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCustomLineRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomLineRequest</p>
 */
public class UpdateCustomLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSegment")
    private java.util.List < IpSegment> ipSegment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long lineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineName")
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
         * <p>The CIDR blocks. Separate IP addresses with a hyphen (-). Enter a CIDR block in each row. You can enter 1 to 50 CIDR blocks at a time. If a CIDR block contains only one IP address, enter the IP address in the format of IP1-IP1. Different CIDR blocks cannot be overlapped.</p>
         */
        public Builder ipSegment(java.util.List < IpSegment> ipSegment) {
            this.putQueryParameter("IpSegment", ipSegment);
            this.ipSegment = ipSegment;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder lineId(Long lineId) {
            this.putQueryParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The name of the custom line. The name must be 1 to 20 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
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

    /**
     * 
     * {@link UpdateCustomLineRequest} extends {@link TeaModel}
     *
     * <p>UpdateCustomLineRequest</p>
     */
    public static class IpSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIp")
        private String endIp;

        @com.aliyun.core.annotation.NameInMap("StartIp")
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
             * <p>The end IP address of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.2.2</p>
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * <p>The start IP address of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
