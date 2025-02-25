// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Ticket} extends {@link TeaModel}
 *
 * <p>Ticket</p>
 */
public class Ticket extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("callerUid")
    private Long callerUid;

    @com.aliyun.core.annotation.NameInMap("createDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private Long expirationTime;

    @com.aliyun.core.annotation.NameInMap("expireDate")
    private String expireDate;

    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("number")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer number;

    @com.aliyun.core.annotation.NameInMap("sharingTo")
    private String sharingTo;

    @com.aliyun.core.annotation.NameInMap("ticket")
    private String ticket;

    @com.aliyun.core.annotation.NameInMap("ticketId")
    private String ticketId;

    @com.aliyun.core.annotation.NameInMap("usedNumber")
    private Integer usedNumber;

    @com.aliyun.core.annotation.NameInMap("valid")
    private Boolean valid;

    private Ticket(Builder builder) {
        this.callerUid = builder.callerUid;
        this.createDate = builder.createDate;
        this.expirationTime = builder.expirationTime;
        this.expireDate = builder.expireDate;
        this.extra = builder.extra;
        this.name = builder.name;
        this.number = builder.number;
        this.sharingTo = builder.sharingTo;
        this.ticket = builder.ticket;
        this.ticketId = builder.ticketId;
        this.usedNumber = builder.usedNumber;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Ticket create() {
        return builder().build();
    }

    /**
     * @return callerUid
     */
    public Long getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return number
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * @return sharingTo
     */
    public String getSharingTo() {
        return this.sharingTo;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return usedNumber
     */
    public Integer getUsedNumber() {
        return this.usedNumber;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return this.valid;
    }

    public static final class Builder {
        private Long callerUid; 
        private String createDate; 
        private Long expirationTime; 
        private String expireDate; 
        private String extra; 
        private String name; 
        private Integer number; 
        private String sharingTo; 
        private String ticket; 
        private String ticketId; 
        private Integer usedNumber; 
        private Boolean valid; 

        /**
         * callerUid.
         */
        public Builder callerUid(Long callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * createDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * expirationTime.
         */
        public Builder expirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * expireDate.
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.extra = extra;
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
         * number.
         */
        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        /**
         * sharingTo.
         */
        public Builder sharingTo(String sharingTo) {
            this.sharingTo = sharingTo;
            return this;
        }

        /**
         * ticket.
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        /**
         * ticketId.
         */
        public Builder ticketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        /**
         * usedNumber.
         */
        public Builder usedNumber(Integer usedNumber) {
            this.usedNumber = usedNumber;
            return this;
        }

        /**
         * valid.
         */
        public Builder valid(Boolean valid) {
            this.valid = valid;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        } 

    } 

}
