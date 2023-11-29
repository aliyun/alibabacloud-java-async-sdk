// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Ticket} extends {@link TeaModel}
 *
 * <p>Ticket</p>
 */
public class Ticket extends TeaModel {
    @NameInMap("callerUid")
    private Long callerUid;

    @NameInMap("createDate")
    private String createDate;

    @NameInMap("expirationTime")
    private Long expirationTime;

    @NameInMap("expireDate")
    private String expireDate;

    @NameInMap("extra")
    private String extra;

    @NameInMap("name")
    private String name;

    @NameInMap("number")
    @Validation(maximum = 2147483647)
    private Integer number;

    @NameInMap("ticket")
    private String ticket;

    @NameInMap("ticketId")
    private String ticketId;

    @NameInMap("usedNumber")
    private Integer usedNumber;

    @NameInMap("valid")
    private Boolean valid;

    private Ticket(Builder builder) {
        this.callerUid = builder.callerUid;
        this.createDate = builder.createDate;
        this.expirationTime = builder.expirationTime;
        this.expireDate = builder.expireDate;
        this.extra = builder.extra;
        this.name = builder.name;
        this.number = builder.number;
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
